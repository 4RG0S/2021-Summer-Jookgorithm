package ClubHomework;

import java.util.Scanner;
import java.util.Arrays;
 
public class GiHyeon11651 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		int[][] arr = new int[num][2];
		
		int i;
		for(i = 0; i < num; i++) {
			arr[i][1] = sc.nextInt();
			arr[i][0] = sc.nextInt();
		}
		
		Arrays.sort(arr, (a, b) -> {
			if(a[0] == b[0]) {
				return a[1] - b[1];
			} else {
				return a[0] - b[0];
			}
		});
		
		/* Array�� ���õ� ����
		 * https://m.blog.naver.com/PostView.naver?isHttpsRedirect=true&blogId=zion830&logNo=221393823494
		 * ���⼭ �����.
		 */
		
		for(i = 0; i < num; i++) {
			System.out.println(arr[i][1] + " " + arr[i][0]);
		}
	}
}