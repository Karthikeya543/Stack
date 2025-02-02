package Stack;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class precedence {

		char[] opstack;
		int top;
		int max;
		
		public void charstack() {
			top = -1;
			max = 20;
			opstack = new char[max];
		}
		
		public char pop() {
			if(top == -1) {
				return '1';
			}
			else {
				return opstack[top--];
			}
		}
		
		
		public int pre(char a, char b) {
			
			Map<Character, Integer> m = new HashMap<Character, Integer>();
			m.put('-', 1);
			m.put('+', 1);
			m.put('/', 2);
			m.put('*', 2);
			m.put('^', 3);
			m.put('(', 4);
			
			if(m.get(a) < m.get(b)) {return 1;}
			else {return -1;}
			
		}
		
		public char[] push(char b) {
			char a = '0';
			char[] xyz = {'0', '0','0', '0','0', '0','0', '0','0', '0'};
			if(top == -1) {
				opstack[++top] = b;
			}
			else {
				int x = 0,i = 0;
				
				for(i = 0; x!=1; i++) {
					a = pop();
					x = pre(a, b);
					if(x == 1) {break;}
					xyz[i] = a;
					if(top == -1) {opstack[++top] = b;return xyz;}
					
//					else {opstack[++top] = b;return a;}
				}
				
				opstack[++top] = a;opstack[++top] = b;
				
			}
			return xyz;
		}
		
		public void display() {
			for(int i = 0; i<=top; i++) {
				System.out.print( opstack[i]+ " ");
			}
			System.out.println();
		}
		
		public int indexoftop() {
			return top;
		}
	
	public static void main(String[] args) {
	
		precedence c = new precedence();
		c.charstack();
		
		char[] xyz = c.push('+');
		c.display();
		System.out.println("xyz" + Arrays.toString(xyz));
		xyz = c.push('-');
		c.display();
		System.out.println("xyz" + Arrays.toString(xyz));
		xyz = c.push('*');
		c.display();
		System.out.println("xyz" + Arrays.toString(xyz));
		xyz = c.push('+');
		c.display();
		System.out.println("xyz" + Arrays.toString(xyz));
		xyz = c.push('*');
		c.display();
		System.out.println("xyz" + Arrays.toString(xyz));
		xyz = c.push('^');
		c.display();
		System.out.println("xyz" + Arrays.toString(xyz));
		xyz = c.push('-');
		c.display();
		System.out.println("xyz" + Arrays.toString(xyz));
//		char a = '0';
//		System.out.println("xyz");
//		a = c.push('+');
//		c.display();
//		a = c.push('-');
//		c.display();
//		a = c.push('*');
//		c.display();
//		a = c.push('^');
//		c.display();
//		a = c.push('/');
//		c.display();
		

	}

}
