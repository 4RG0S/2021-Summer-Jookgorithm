package ClubHomework;

import java.util.Arrays;
import java.util.Scanner;
 
public class GiHyeon1546 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		double arr[] = new double[num];
		int length = arr.length;
		
		int i;
		for(i = 0; i < length; i++) {
			arr[i] = sc.nextDouble();
		}
		
		Arrays.sort(arr);
		
		double sum = 0;
		for(i = 0; i < length; i++) {
			double score = arr[i] / arr[length - 1] * 100;
			sum = sum + score;
		}
		
		System.out.println(sum / length);
	}
}