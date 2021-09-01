package ClubHomework;

import java.util.Scanner;
import java.util.Arrays;
 
public class GiHyeon2981 {	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		int[] arr = new int[num];
		
		int i;
		for(i = 0; i < num; i++) {
			int a = sc.nextInt();
			arr[i] = a;
		}
        
		Arrays.sort(arr);
 
		int gcd = arr[1] - arr[0];
 
		for(i = 1; i < num - 1; i++) {
			gcd = GCD.gcd(gcd, arr[i + 1] - arr[i]);
		}

		for(i = 2; i < gcd + 1; i++) {
	   
			if(gcd % i == 0) {
				System.out.print(i + " ");
			}
		}
		
	}
}
	
class GCD {
	
	public static int gcd(int a, int b) {
		
		int remainder;
		while(!(b == 0)) {
			remainder = a % b;
			a = b;
			b = remainder;	
		}
		return a;
	}
 
}