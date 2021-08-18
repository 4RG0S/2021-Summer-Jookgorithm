package ClubHomework;

import java.util.Scanner;

public class GiHyeon1193 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		int count = 0;
		int i = 0;
		
		for(;;) {
			
			i++;
			count = count + i;
			
			if(count >= num) {
				
				if((i % 2) == 0) {
					int result = count - num + 1;
					System.out.println(num - count + i + "/" + result);
				} else {
					int result = count - num + 1;
					int result2 = num - count + i;
					System.out.println(result + "/" + result2);
				}
				
				break;
			}
			
		}
		
	}

}
