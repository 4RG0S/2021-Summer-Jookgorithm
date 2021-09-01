package ClubHomework;

import java.util.Scanner;

public class GiHyeon11720 {
	
	public static void main(String[] args) {	
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String str = sc.next();
		
		int sum = 0;
        
		int i;
		for(i = 0; i < num; i++) {
			sum = sum + str.charAt(i) - 48;
		}
		
		System.out.print(sum);
	}
}