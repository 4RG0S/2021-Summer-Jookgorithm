import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

class Gold_1_1517 {

  static class indexNode implements Comparable<indexNode> {
    int index, value;

    public indexNode(int index, int value) {
      this.index = index;
      this.value = value;
    }

    @Override
    public int compareTo(indexNode comp) {
      if (this.value > comp.value) {
        return 1;
      } else if (this.value < comp.value) {
        return -1;
      } else {
        return 0;
      }
    }
  }

  static long cnt[] = new long[2000005];

  static long sum(int index, int left, int right, int start, int end) {
    if (right < start || end < left) {
      return 0;
    }
    if (start <= left && right <= end) {
      return cnt[index];
    }
    int middle = (left + right) / 2;
    return sum(index * 2, left, middle, start, end) + sum(index * 2 + 1, middle + 1, right, start, end);
  }
  public static void main(String args[]) {
    Scanner scan = new Scanner(System.in);
    int N = Integer.parseInt(scan.nextLine());
    indexNode nodeArray[] = new indexNode[N];
    StringTokenizer line = new StringTokenizer(scan.nextLine());
    scan.close();

    for (int i = 0; i < N; i += 1) {
      nodeArray[i] = new indexNode(i + 1, Integer.parseInt(line.nextToken()));
    }
    Arrays.sort(nodeArray);
    int base = 1;
    while(base < N) base *= 2;
    long result = 0;
    for (indexNode iter : nodeArray) {
      result += sum(1, 1, base, iter.index + 1, base);
      for (int i = base - 1 + iter.index; i != 0; i /= 2) {
        ++cnt[i];
      }
    }
    System.out.println(result);
  }
}
