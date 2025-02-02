package Stack;

import java.util.Scanner;

public class InfixtoPostfix extends precedence {
	
	public static void conv(String exp) {
		char[] newexp = exp.toCharArray();
		char[] postfix = new char[exp.length()+10];
		precedence xyz = new precedence();
		xyz.charstack();
		int x = 0;
		for(int i = 0; i<exp.length(); i++) {
			
			if((int)newexp[i] == 42 || (int)newexp[i] == 43 || (int)newexp[i] == 45 || (int)newexp[i] == 47 || (int)newexp[i] == 94 ) {
				char[] c = xyz.push(newexp[i]);
				
				if(c[0] == '0') {continue;}
				for(int j = 0; c[j]!='0'; j++) {
					postfix[x] = c[j];x++;
				}
				
//				else {postfix[x] = c;x++;}
			}
			else {
				postfix[x] = newexp[i];x++;
			}
			
			
		}
		
		for(int i = xyz.indexoftop(); i>=0; i--) {
			char fg = xyz.pop();
			if(fg == '1') {break;}
			postfix[x] = fg;x++;
		}
		
		for(int i = 0; i<postfix.length; i++) {
			System.out.print(postfix[i]);
		}
		System.out.println();
		
	}

	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter expression in Infix form: ");
		String exp = sc.nextLine();
		conv(exp);
		sc.close();
	}

}
