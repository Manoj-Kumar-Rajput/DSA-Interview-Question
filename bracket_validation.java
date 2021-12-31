package stack;
import java.util.Scanner;
import java.util.Stack;

public class bracket_validation 
{
	public static void main(String[] args)
	{
		Stack<Character> stack=new Stack<>();
		Scanner s=new Scanner(System.in);
		String brackets=s.next();
		s.close();
		for(int i=0;i<brackets.length();i++)
		{
			if(brackets.charAt(i)=='}' || brackets.charAt(i)==')' || brackets.charAt(i)==']')
			{
				char c =brackets.charAt(i);
				if(stack.size()==0)
				{
					stack.push(c);
				}
				else
				{
					char c1=stack.peek();
				switch(c)
				{
				case '}':
					if(c1=='{')
						stack.pop();
					else
						stack.push(c);
					break;
				case ')':
					if(c1=='(')
						stack.pop();
					else
						stack.push(c);
					break;
				case ']':
					if(c1=='[')
						stack.pop();
					else
						stack.push(c);
					break;
				}
				}
			}
			else
			{
				char c=brackets.charAt(i);
				stack.push(c);
			}
		}
		System.out.println((stack.size()==0)? "VALID" : "NOT VALID");
}
}
					
					