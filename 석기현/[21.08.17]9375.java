package ClubHomework;

import java.util.Scanner;
import java.util.HashMap;

public class GiHyeon9375 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		int i, j;
		for(i = 0; i < num; i++) {
		
			HashMap<String, Integer> HashMap = new HashMap<>();
			int number = sc.nextInt();
			
			String a, b;
			for(j = 0; j < number; j++) {
			
				a = sc.next();
				b = sc.next();
				
				if(HashMap.containsKey(b)) {
					HashMap.put(b, HashMap.get(b) + 1);
				} else {
					HashMap.put(b, 1);
				}
				
			}
			
			int num1 = 1;
			
			for(int num2 : HashMap.values()) {
				num1 = num1 * (num2 + 1);
			}
			
			System.out.println(num1 - 1);
			
		}
			
	}
}
				