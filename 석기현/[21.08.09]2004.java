package ClubHomework;

import java.util.Scanner;

public class GiHyeon2004 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		long num1 = sc.nextLong();
		long num2 = sc.nextLong();
		
		// n! / r! * (n - r)! 
		long count1 = Combination.two(num1) - Combination.two(num2) - Combination.two(num1 - num2);
		long count2 = Combination.five(num1) - Combination.five(num2) - Combination.five(num1 - num2);
		
		long min = count1;
		
		if(count1 > count2) {
			min = count2;
		}
		
		System.out.println(min);
	}
}

class Combination {
	
	public static long two(long num) {
		
		long count = 0;
		
		while(true) {
			
			if(num < 2) {
				break;
			}
			
			count = count + num / 2;
			num = num / 2;
			
		}
		
		return count;
	}
	
	public static long five(long num) {
	
		long count = 0;
	
		while(true) {
		
			if(num < 5) {
				break;
			}
		
			count = count + num / 5;
			num = num / 5;
		
	}
	
		return count;
	}
	
}