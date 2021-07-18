package ClubHomework;

import java.util.Scanner;

public class GiHyeon1934 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		int lcmarr[] = new int[num];
		
		int i;
		for(i = 0; i < num; i++) {
			
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			int gcd = gcd111.gcd(a, b);
			int lcm = a * b / gcd;
			
			lcmarr[i] = lcm;
				
			}
		
		for(i = 0; i < num; i++) {
			System.out.println(lcmarr[i]);
		}
	}
    
}

class gcd111 {
	
	public static int gcd(int a, int b) {
		
		int temp;
		
		if(b > a) {
			temp = a;
			a = b;
			b = temp;
		}
		if(b == 0) {
			return a;
		} else {
			return gcd(b, a % b);
		}
	}
}