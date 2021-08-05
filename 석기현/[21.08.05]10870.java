package ClubHomework;

import java.util.Scanner;

public class GiHyeon10870 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		int result = fibonacci.fib(num);
		System.out.println(result);
 
	}
}

class fibonacci {
	
	public static int fib(int num) {
		
		if(num == 1) {
			return 1;
		} else if(num == 0) {
			return 0;
		}
		
		return fib(num - 2) + fib(num - 1);
	}
}