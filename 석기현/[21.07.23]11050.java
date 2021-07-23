package ClubHomework;

import java.util.Scanner;

public class GiHyeon11050 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int a, b;
		a = sc.nextInt();
		b = sc.nextInt();
		
		int c = factorial.fact(a) / (factorial.fact(a - b) * factorial.fact(b));
		System.out.println(c);
	}

}

class factorial {
	
	public static int fact(int num) {
		
		int i = 1;
		int j;
		for(j = 1; j < num + 1; j++) {
			i = j * i;
		}
		
		return i;
	}
}