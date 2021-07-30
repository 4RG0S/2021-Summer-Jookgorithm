package ClubHomework;

import java.util.Scanner;

public class GiHyeon2740 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
	
		int arr1[][] = new int[num1][num2];
		
		int i, j;
		for(i = 0; i < num1; i++) {
			for(j = 0; j < num2; j++) {
				arr1[i][j] = sc.nextInt();
			}
		}
                
		int num3 = sc.nextInt(); 
		int num4 = sc.nextInt();
		
		int arr2[][] = new int[num3][num4];
		
		for(i = 0; i < num3; i++) {
			for(j = 0; j < num4; j++) {
				arr2[i][j] = sc.nextInt();
			}
		}
		
		int arr3[][] = new int[num1][num4];
		
		int a;
		for(i = 0; i < num1; i++) {
			for(j = 0; j < num4; j++) {
				for(a = 0; a < num3; a++) {
					arr3[i][j] += arr1[i][a] * arr2[a][j];
				}
			}
		}

		for(i = 0; i < num1; i++) {
			for(j = 0; j < num4; j++) {
				System.out.print(arr3[i][j] + " ");
			}
			
			System.out.println();
		}
	}
}