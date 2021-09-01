package ClubHomework;

import java.util.Scanner;

public class GiHyeon2941 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
        
		int count = 0;
		int length = word.length();
		
		int i;
		for (i = 0; i < length; i++) {
 
			char a = word.charAt(i);
 
			if(a == 'c') {
				if(i < length - 1) {
					if(word.charAt(i + 1) == '=') {
						i++;		
					}
					else if(word.charAt(i + 1) == '-') {
						i++;
					}
				}
			}
		    
			else if(a == 'd') {
				if(i < length - 1) {
					if(word.charAt(i + 1) == 'z') {
						if(i < length - 2) {
							if(word.charAt(i + 2) == '=') {
								i = i + 2;
							}
						}
					}
		        
					else if(word.charAt(i + 1) == '-') {
						i++;
					}
				}
			}
		    
			else if(a == 'l') {
				if(i < length - 1) {
					if(word.charAt(i + 1) == 'j') {
						i++;
					}
				}
			}
		    
			else if(a == 'n') {
				if(i < length - 1) {
					if(word.charAt(i + 1) == 'j') {
						i++;
					}
				}
			}
 
			else if(a == 's') {
				if(i < length - 1) {
					if(word.charAt(i + 1) == '=') {
						i++;
					}
				}
		    }
 
			else if(a == 'z') {
				if(i < length - 1) {
					if(word.charAt(i + 1) == '=') {
						i++;
					}
				}
			}
		    
			count++;
		}
 
		System.out.println(count);
	}
}
 