import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Platinum_5_2243 {
  static class SegTree {
    int sumOfCandy[] = new int[2097152];
    void addCandy(int favor, int count) {
      for (int index = 1058576 - 1 + favor; index != 0; index /= 2) {
        sumOfCandy[index] += count;
      }
    }
    int pickCandy(int order) {
      int index = 1;
      int customOrder = order;
      int resultIndex = 0;
      while(true) {
        if (1058576 <= index && index < 2097152) {
          resultIndex = index;
          break;
        }
        if (sumOfCandy[index * 2] >= customOrder) {
          index = index * 2;
        } else if (sumOfCandy[index * 2 + 1] >= customOrder - sumOfCandy[index * 2]) {
          customOrder -= sumOfCandy[index * 2];
          index = index * 2 + 1;
        }
      }
      int favor = resultIndex - 1058576 + 1;
      addCandy(favor, -1);
      return favor;
    }
  }
  public static void main(String args[]) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    SegTree tree = new SegTree();
    for (int i=0;i<n;i++) {
      StringTokenizer line = new StringTokenizer(br.readLine());
      int type = Integer.parseInt(line.nextToken());
      if (type == 1) {
        int order = Integer.parseInt(line.nextToken());
        System.out.println(tree.pickCandy(order));
      } else if (type == 2) {
        int favor = Integer.parseInt(line.nextToken());
        int count = Integer.parseInt(line.nextToken());
        tree.addCandy(favor, count);
      }
    }
  }
}
