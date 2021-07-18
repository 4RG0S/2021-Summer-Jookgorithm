import java.util.HashMap;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Platinum_7578 {

  static class SegTree {
    int count[];
    public SegTree(int size) {
      count = new int[size * 2];
    }
    void updateCount(int start, int end, int left, int right, int index) {
      if (end < left || right < start) {
        return;
      }
      if (left <= start && end <= right) {
        count[index]++;
        return;
      }
      int middle = (start + end) / 2;
      updateCount(start, middle, left, right, index * 2);
      updateCount(middle + 1, end, left, right, index * 2 + 1);
    }
  }
  public static void main(String args[]) {
    Scanner scan = new Scanner(System.in);
    int N = Integer.parseInt(scan.nextLine());
    int connect[] = new int[N+1];
    HashMap<Integer, Integer> map = new HashMap<>();
    StringTokenizer line = new StringTokenizer(scan.nextLine());
    for (int i=1;i<=N;i++) {
      map.put(Integer.parseInt(line.nextToken()), i);
    }
    line = new StringTokenizer(scan.nextLine());
    for (int i=1;i<=N;i++) {
      connect[i] = map.get(Integer.parseInt(line.nextToken()));
    }
    int base = 1;
    while (base < N) base *= 2;
    SegTree tree = new SegTree(base);
    long result = 0;
    for (int i=1;i<=N;i++) {
      int connection = connect[i];
      for (int j=base - 1 + connection;j != 0; j /= 2) {
        result += tree.count[j];
      }
      tree.updateCount(1, base, 1, connection, 1);
    }
    System.out.println(result);
  }
}
