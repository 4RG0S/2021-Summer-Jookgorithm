package ClubHomework;

import java.util.Scanner;
import java.util.Arrays;

public class GiHyeon2805 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int num2 = sc.nextInt();
		
		int[] arr = new int[num];
		
		int i;
		for(i = 0; i < num; i++) {
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);
		
		long left = 1;
		long right = arr[num - 1];
		long middle = 0;
		long result = 0;
		
		while(left <= right) {
			
			middle = (left + right) / 2;
			result = 0;
			
			for(i = 0; i < num; i++) {
				if(arr[i] >= middle) {
					result = result + arr[i] - middle;
				}
			}
			
			if(result >= num2) {
				left = middle + 1;
			} else if(result < num2) {
				right = middle - 1;
			}
		}
		
		System.out.println(right);
	}

}
