package Stack;

import java.util.Scanner;

public class postfixEval extends stack1 {

	public static void cal(String exp) {
		stack1 s = new stack1();
		s.stack(exp.length());
		char[] newexp = exp.toCharArray();
		for(int i = 0; i<exp.length(); i++){
			if((int)newexp[i] == 42 || (int)newexp[i] == 43 || (int)newexp[i] == 45 || (int)newexp[i] == 47 || (int)newexp[i] == 94 ) {
				s.operation(newexp[i]);
				
			}
			else {
				int xyz = newexp[i] - '0';
				s.push(xyz);
			}
		}
		System.out.print("Final: ");
		s.display();
		
	}
	
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String exp = sc.nextLine();
	
	
	cal(exp);
	
	
	
	sc.close();
	}

}
