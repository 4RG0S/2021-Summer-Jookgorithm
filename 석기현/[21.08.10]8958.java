package ClubHomework;

import java.util.Scanner;

public class GiHyeon8958 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		String arr[] = new String[num];
		
		int i;
		for(i = 0; i < num; i++) {
			arr[i] = sc.next();
		}
		
		int j;
		for(i = 0; i < num; i++) {
			
			int sum = 0;
			int sequence = 0;
			
			for(j = 0; j < arr[i].length(); j++) {
				
				if(arr[i].charAt(j) == 'O') {
					sequence++;
				} else {
					sequence = 0;
				}
				
				sum = sum + sequence;
			}
			
			System.out.println(sum);

		}
		
		
	}

}
