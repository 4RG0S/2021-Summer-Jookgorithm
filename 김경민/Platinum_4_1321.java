import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Platinum_4_1321 {
  static class SegTree {
    long node[];
    public SegTree(int base) {
      node = new long[base * 2];
    }
    void init(int arr[], int left, int right, int index) {
      if (left == right) {
        node[index] = arr[left];
        return;
      }
      int middle = (left + right) / 2;
      init(arr, left, middle, index * 2);
      init(arr, middle + 1, right, index * 2 + 1);
      node[index] = node[index * 2] + node[index * 2 + 1];
    }
    void update(int nodeIndex, int diff) {
      if (nodeIndex == 0) {
        return;
      }
      node[nodeIndex] += diff;
      update(nodeIndex / 2, diff);
    }
    int getGroup(int index, int start, int end, long order) {
      if (start == end)
        return start;
      int middle = (start + end) / 2;
      if (node[index * 2] >= order) {
        return getGroup(index * 2, start, middle, order);
      }
      return getGroup(index * 2 + 1, middle + 1, end, order - node[index * 2]);
    }
    void printNode() {
      for (int i=1;i<node.length;i++) {
        System.out.print(node[i] + " ");
      }
    }
  }
  public static void main(String args[]) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    int base = 1;
    while (base < N) base *= 2;
    StringTokenizer line = new StringTokenizer(br.readLine());
    int supplies[] = new int[base + 1];
    for (int i=1;i<=N;i++) {
      supplies[i] = Integer.parseInt(line.nextToken());
    }
    SegTree tree = new SegTree(base);
    tree.init(supplies, 1, base, 1);

    int M = Integer.parseInt(br.readLine());
    for (int i=0;i<M;i++) {
      line = new StringTokenizer(br.readLine());
      int option = Integer.parseInt(line.nextToken());
      if (option == 1) {
        int group = Integer.parseInt(line.nextToken());
        int diff = Integer.parseInt(line.nextToken());
        tree.update(base - 1 + group, diff);
      } else if (option == 2) {
        int order = Integer.parseInt(line.nextToken());
        System.out.println(tree.getGroup(1, 1, base, order));
      } else if (option == 3) {
        tree.printNode();
      }
    }
  }
}
