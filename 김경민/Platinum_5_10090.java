import java.util.Scanner;
import java.util.StringTokenizer;

public class Platinum_5_10090 {
  static class IndexTree {
    int node[];
    public IndexTree(int base) {
      node = new int[base * 2];
    }
    int getLarger(int start, int end, int left, int right, int index) {
      if (left <= start && end <= right) {
        return node[index];
      }
      if (right < start || end < left) {
        return 0;
      }
      int middle = (start + end) / 2;
      return getLarger(start, middle, left, right, index * 2) + getLarger(middle + 1, end, left, right, index * 2 + 1);
    }
  }
  public static void main(String args[]) {
    Scanner scan = new Scanner(System.in);
    int N = Integer.parseInt(scan.nextLine());
    int base = 1;
    while (base < N) base *= 2;
    StringTokenizer line = new StringTokenizer(scan.nextLine());
    int arr[] = new int[N];
    for (int i=0;i<N;i++) {
      arr[i] = Integer.parseInt(line.nextToken());
    }
    IndexTree tree = new IndexTree(base);
    long result = 0;
    for (int i=0;i<N;i++) {
      int element = arr[i];
      result += tree.getLarger(1, base, element + 1, base, 1);
      for (int j=base - 1 + element;j != 0;j /= 2) {
        ++tree.node[j];
      }
    }
    System.out.println(result);
  }
}
