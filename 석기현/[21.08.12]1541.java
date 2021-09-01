package ClubHomework;

import java.util.Scanner;

public class GiHyeon1541 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		int count = 0;
		
		String[] arr = str.split("[-]");
		int i;
		for(i = 0; i < arr.length; i++) {
			
			int a = 0;
			String[] arr2 = arr[i].split("[+]");
			
			for(String num : arr2) {
				a = a + Integer.parseInt(num);
			}
			
			if(i == 0) {
				count = count + a;
			} else {
				count = count - a;
			}
			
		}
		
		System.out.println(count);
	}
}