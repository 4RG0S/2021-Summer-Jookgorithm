import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;

public class Platinum_4_14449 {
  static class IndexTree {
    int node[];
    public IndexTree(int base) {
      node = new int[base * 2];
    }
    int sumOfLarger(int start, int end, int left, int right, int index) {
      if (left <= start && end <= right) {
        return node[index];
      }
      if (right < start || end < left) {
        return 0;
      }
      int middle = (start + end) / 2;
      return sumOfLarger(start, middle, left, right, index * 2) + sumOfLarger(middle + 1, end, left, right, index * 2 + 1);
    }
  }
  public static void main(String args[]) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    HashMap<Integer, Integer> order = new HashMap<>();
    int N = Integer.parseInt(br.readLine());
    int base = 1;
    while (base < N) base *= 2;
    IndexTree tree = new IndexTree(base);
    int height[] = new int[N];
    int sortedArray[];

    for (int i=0;i<N;i++) {
      height[i] = Integer.parseInt(br.readLine());
    }
    sortedArray = height.clone();
    Arrays.sort(sortedArray);
    for (int i=0;i<N;i++) {
      order.put(sortedArray[i], i + 1);
    }
    int result = 0;
    for (int i=0;i<N;i++) {
      int indexOrder = order.get(height[i]);
      int leftLargerCount = tree.sumOfLarger(1, base, indexOrder + 1, base, 1);
      int rightLargerCount = N - indexOrder - leftLargerCount;
      if (leftLargerCount * 2 < rightLargerCount || leftLargerCount > rightLargerCount * 2) {
        ++result;
      }
      for (int j=base - 1 + indexOrder;j != 0;j /= 2) {
        ++tree.node[j];
      }
      // System.out.println("=======================");
      // System.out.println(leftLargerCount + " " + rightLargerCount);
    }
    System.out.println(result);
  }
}
