package ClubHomework;

import java.util.Scanner;

public class GiHyeon1002 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		int[] arr = new int[num];
		
		double a, b;
		int x, y, z, x1, y1, z1;
		
		int i;
		for(i = 0; i < num; i++) {
			
			x = sc.nextInt();
			y = sc.nextInt();
			z = sc.nextInt();
			
			x1 = sc.nextInt();
			y1 = sc.nextInt();
			z1 = sc.nextInt();
			
			a = Math.pow((x1 - x), 2) + Math.pow((y1 - y), 2);
			b = Math.sqrt(a);
			
			if((x == x1) && (y == y1) && (z == z1)) {
				arr[i] = -1;
			} else if(((x == x1) && (y == y1) && !(z == z1)) || (b < Math.abs(z1 - z) || (z + z1 < b))) {
				arr[i] = 0;
			} else if((Math.abs(z1 - z) == b) || (b == z1 + z)) {
				arr[i] = 1;
			} else {
				arr[i] = 2;
			}
			
		}
		
		for(i = 0; i < num; i++) {
			System.out.println(arr[i]);
		}
	}
}
		
		