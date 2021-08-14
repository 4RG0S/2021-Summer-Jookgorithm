package ClubHomework;

import java.util.Scanner;

public class GiHyeon13305 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		long cost[] = new long[num];
		long distance[] = new long[num - 1];
		
		int i;
		for(i = 0; i < num - 1; i++) {
			distance[i] = sc.nextLong();
		}
		
		for(i = 0; i < num; i++) {
			cost[i] = sc.nextLong();
		}
		
		long sum = 0;
		
		for(i = 0; i < num - 1; i++) {
			
			if(cost[i] < cost[i + 1]) {
				cost[i + 1] = cost[i];
			}
			
		}
		
		for(i = 0; i < num - 1; i++) {
			sum += cost[i] * distance[i];
		}
		
		System.out.println(sum);
		
	}
}