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
		/* StringBuilder�� ���� ���� ���� : https://wakestand.tistory.com/245 */

		ArrayList<Integer> list = new ArrayList<>();
		/* ArrayList�� ���� ����� Ȱ�� ���� : https://coding-factory.tistory.com/551
		 * ���� ���� �� �ڹ��� ������ ���� ���� ������
		 */
		int i;
		for(i = 0; i < num; i++) {
			int a = sc.nextInt();
			list.add(a);
		}
		
		Collections.sort(list);
		/* Collections Ŭ���� ���� ���� �� �ڹ��� ������ ���� ������. */
		
		for(int val : list) {
			/* foreach : https://wikidocs.net/264 */
			sb.append(val);
			sb.append('\n');
		}
		System.out.println(sb);
	}
}