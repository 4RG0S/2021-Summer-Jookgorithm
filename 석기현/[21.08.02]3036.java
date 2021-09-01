package ClubHomework;

import java.util.Scanner;

public class GiHyeon3036 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		int standard = sc.nextInt();
		
		int i;
		for(i = 0; i < num - 1; i++) {
			
			int a = sc.nextInt();
			int gcd = GCD.gcd(standard, a);
			
			int c = standard / gcd;
			int d = a / gcd;
			
			System.out.println(c + "/" + d);
		}

	}

}

class GCD {
	
	public static int gcd(int a, int b) {
		
		int r;
		
		while(!(b == 0)) {
			
			r = a % b;
			a = b;
			b = r;
			
		}
		
		return a;
	}
}