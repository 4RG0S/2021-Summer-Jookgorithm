package ClubHomework;

import java.util.Scanner;

public class GiHyeon1676 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		int count = 0;
		
		while(true) {
			
			if(num >= 5) {
			
				count = count + num / 5;
				num = num / 5;
			
			} else {
				break;
			}
		}
		
		// ��� ¥�ϱ� �ð��ʰ�(factorial Ŭ���� ������� ��)
		/* n!���� 2�� ������ 5�� �������� ����.( 2 < 5) ���� 5�� ������ ����.
		 */
		
		System.out.println(count);
	}
}