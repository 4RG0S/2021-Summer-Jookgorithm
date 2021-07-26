package ClubHomework;

import java.util.Scanner;

public class GiHyeon1010 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		int i;
		for(i = 0; i < num; i++) {
			
			double left = sc.nextDouble();
			double right = sc.nextDouble();
			
			System.out.println(Math.round((factorial.fact(right) / (factorial.fact(right - left) * factorial.fact(left)))));
		}

	}

}

class factorial {
	
	public static double fact(double num) {
		
		double i = 1;
		double j;
		for(j = 1; j < num + 1; j++) {
			i = j * i;
		}
		
		return i;
	}
}