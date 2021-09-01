package ClubHomework;

import java.util.Scanner;

public class GiHyeon1427 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int[] count = new int[10]; // 1,000,000,000이니까 최대 숫자 10칸이 필요하다.
 
		int num = sc.nextInt();
 
		while (true) {
			
			int a = num % 10;
			count[a]++;
			num = num / 10;
			
			if(num == 0) {
				break;
			}
		}
		
		int i;
		for (i = 9; i >= 0; i--) {
			while (count[i]-- > 0) {
				System.out.print(i);
			}
		}
 
	}

}
