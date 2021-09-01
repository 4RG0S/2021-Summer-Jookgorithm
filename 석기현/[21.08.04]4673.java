package ClubHomework;

public class GiHyeon4673 {
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean[] bool = new boolean[10001];
		
		int i;
		for (i = 1; i < 10001; i++){
			
			int num = D.d(i);
		
			if(num < 10001) {
				bool[num] = true;
			}
		}
 
		for (i = 1; i < 10001; i++) {
			if (bool[i] == false) {
				System.out.println(i);
			}
		}
	}
 

}	
	
class D {
	
	public static int d (int num) {
		
		int sum = num;
		
		while(true) {
			
			if(num == 0) { 
				break;
			}
			
			sum = sum + (num % 10);
			num = num / 10;
			
		}
		
		return sum;
	}
}