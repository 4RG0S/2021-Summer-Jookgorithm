package ClubHomework;

import java.util.Scanner;
import java.util.Arrays;

public class GiHyeon1920 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		int arr[] = new int[num];
		
		int i;
		for(i = 0; i < num; i++) {
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);
		
		int num2 = sc.nextInt();
		
		for(i = 0; i < num2; i++) {
			
			int num3 = sc.nextInt();
			
			int a = 0;
			int b = num - 1;
			int choose = 1;
			
			while(true) {
				
				if(a > b) {
					break;
				}
				
				int mid = (a + b) / 2;
				int midvalue = arr[mid];
				
				if(midvalue > num3) {
					b = mid - 1;
				} else if(midvalue < num3) {
					a = mid + 1;
				} else {
					System.out.println(1);
					choose = 0;
					break;
				}
			}
			
			if(choose == 1) {
				System.out.println(0);
			}
				
		}

	}

}
