import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Platinum_5_19646 {
  static class SegTree {
    int node[];
    public SegTree(int base) {
      node = new int[base * 2];
    }
    int init(int arr[], int left, int right, int index) {
      if (left == right) {
        return node[index] = arr[left];
      }
      int middle = (left + right) / 2;
      return node[index] = init(arr, left, middle, index * 2) + init(arr, middle + 1, right, index * 2 + 1);
    }
    int getElementOfOrder(int index, int start, int end, int order) {
      if (start == end)
        return start;
      int middle = (start + end) / 2;
      if (node[index * 2] >= order) {
        return getElementOfOrder(index * 2, start, middle, order);
      }
      return getElementOfOrder(index * 2 + 1, middle + 1, end, order - node[index * 2]);
    }
  }
  public static void main(String args[]) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int N = Integer.parseInt(br.readLine());
    int base = 1;
    while (base < N) base *= 2;

    StringTokenizer line = new StringTokenizer(br.readLine());
    int value[] = new int[base + 1];
    for (int i=1;i<=N;i++) {
      value[i] = Integer.parseInt(line.nextToken());
    }
    SegTree tree = new SegTree(base);
    tree.init(value, 1, base, 1);

    line = new StringTokenizer(br.readLine());
    for (int i=0;i<N;i++) {
      int order = Integer.parseInt(line.nextToken());
      int elementIndex = tree.getElementOfOrder(1, 1, base, order);
      for (int j=base - 1 + elementIndex;j != 0;j /= 2) {
        tree.node[j] -= value[elementIndex];
      }
      bw.write(elementIndex + " ");
    }
    bw.flush();
  }
}
