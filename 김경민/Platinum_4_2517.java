import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.HashMap;

public class Platinum_4_2517 {

  static class IndexTree {
    int node[];
    public IndexTree(int base) {
      node = new int[base * 2];
    }
    int countNode(int left, int right, int start, int end, int index) {
      if (start <= left && right <= end) {
        return node[index];
      }
      if (right < start || end < left) {
        return 0;
      }
      int middle = (left + right) / 2;
      return countNode(left, middle, start, end, index * 2) + countNode(middle + 1, right, start, end, index * 2 + 1);
    }
  }
  public static void main(String args[]) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    HashMap<Integer, Integer> order = new HashMap<>();
    int N = Integer.parseInt(br.readLine());
    int base = 1;
    while (base < N) base *= 2;
    IndexTree tree = new IndexTree(base);
    int skillLevel[] = new int[N];
    for (int i=0;i<N;i++) {
      skillLevel[i] = Integer.parseInt(br.readLine());
    }
    int sortedArray[] = skillLevel.clone();
    Arrays.sort(sortedArray);
    for (int i=0;i<N;i++) {
      order.put(sortedArray[i], i+1);
    }
    for (int i=0;i<N;i++) {
      int orderIndex = order.get(skillLevel[i]);
      bw.write(Integer.toString(i + 1 - tree.countNode(1, base, 1, orderIndex, 1)) + '\n');

      for (int j=base - 1 + orderIndex;j != 0; j /= 2) {
        ++tree.node[j];
      }
    }
    bw.flush();
  }
}
