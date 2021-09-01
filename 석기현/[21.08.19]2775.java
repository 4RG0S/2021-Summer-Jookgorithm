package ClubHomework;

import java.util.Scanner;

public class GiHyeon2775 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in); 
		int num = sc.nextInt();
		
		int[][] arr = new int[15][15];
		
		int i;
		for(i = 0; i < 15; i++) {
			arr[i][1] = 1;
			arr[0][i] = i;
		}
 
		int j;
		for(i = 1; i < 15; i++) {	
			for(j = 2; j < 15; j++) {
				arr[i][j] = arr[i][j - 1] + arr[i - 1][j];
			}	
		}
			
		for(i = 0; i < num; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.println(arr[a][b]);
		}
	}
 
}