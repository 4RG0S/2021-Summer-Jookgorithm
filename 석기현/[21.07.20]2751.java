package ClubHomework;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
 
public class GiHyeon2751 {	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		StringBuilder sb = new StringBuilder();
		/* StringBuilder에 대한 개념 참고 : https://wakestand.tistory.com/245 */

		ArrayList<Integer> list = new ArrayList<>();
		/* ArrayList에 대한 개념과 활용 참고 : https://coding-factory.tistory.com/551
		 * 또한 모각코 때 자바의 정석을 통핵 대충 익혔음
		 */
		int i;
		for(i = 0; i < num; i++) {
			int a = sc.nextInt();
			list.add(a);
		}
		
		Collections.sort(list);
		/* Collections 클래스 역시 모각코 때 자바의 정석을 통해 익혔음. */
		
		for(int val : list) {
			/* foreach : https://wikidocs.net/264 */
			sb.append(val);
			sb.append('\n');
		}
		System.out.println(sb);
	}
}