package Stack;

public class stack1 {

	int max;
	int top;
	int[] s;
	
	public void stack(){
		max = 10;
		top = -1;
		s = new int[max];
	}
	
	public void stack(int m) {
		max = m;
		top = -1;
		s = new int[max];
	}
	
	public void push(int m) {
		if(top > max-1) {
			System.out.println("Stack is Full..");
		}
		else {
			s[++top] = m;
		}
	}
	
	public int pop() {
		if(top == -1) {
			System.out.println("Stack is Empty...");
			return -1;
		}
		else {
			return s[top--];
		}
	}
	
	public boolean isempty() {
		if(top== -1) {
			return true;
		}
		else {
			return false;
		}
	}
	
	
	public void display() {
		for(int i = 0; i<=top; i++) {
			System.out.print(s[i] + " ");
		}
		System.out.println();
	}
	
	
	public void operation(char a) {
		if(top < 1) {
			System.out.println("Operation can not be performed as stack does not have enough elements...");
		}
		else {
			int c, d;
			switch(a) {
			case '+':
					c = pop();
					d = pop();
					push(d+c);
				break;
			case '-':
					c = pop();
					d = pop();
					push(d-c);
				break;
			case '*':
				c = pop();
				d = pop();
				push(d*c);
				break;
			case '/':
				c = pop();
				d = pop();
				push((int)d/c);
				
				break;
				
			case '^':
				c = pop();
				d = pop();
				push((int)Math.pow(d, c));
				break;
			}
		}
	}
	
	public static void main(String[] args) {
		stack1 a = new stack1();
		a.stack();
		a.push(20);
		a.push(20);
		a.push(20);
		System.out.println(a.pop());
		a.display();
		a.operation('-');
		a.display();

	}

}
