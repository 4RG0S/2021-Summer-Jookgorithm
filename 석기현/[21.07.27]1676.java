package ClubHomework;

import java.util.Scanner;

public class GiHyeon1676 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		int count = 0;
		
		while(true) {
			
			if(num >= 5) {
			
				count = count + num / 5;
				num = num / 5;
			
			} else {
				break;
			}
		}
		
		// 길게 짜니까 시간초과(factorial 클래스 사용했을 떄)
		/* n!에는 2의 개수가 5의 개수보다 많다.( 2 < 5) 따라서 5의 개수만 세기.
		 */
		
		System.out.println(count);
	}
}