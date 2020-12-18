package Demo11;
import java.util.Stack;

public class Brackets {
	public static int solution(String s)
	{
	Stack<Character> stack=new Stack<Character>();
	if(s==null) {
		return 0;
	} else if (s.isEmpty())
	{
		return 1;
	}
	for(Character c:s.toCharArray())
	{
		if(c=='[' || c=='{' ||c=='(')
		{
			stack.push(c);
		}
		else
		{
		 if(c==')' )
		{
			if( stack.peek()=='(')
				stack.pop();
			else return 0;
		}
		 if(c=='{' )
			{
				if( stack.peek()=='}')
					stack.pop();
				else return 0;
			}
		 if(c=='[' )
			{
				if( stack.peek()=='}')
					stack.pop();
				else return 0;
			}
		}
	}
	
	
		
	
	if(stack.isEmpty())
	{
		return 1;
	
	}
	return 0;
}

public static void main(String[] args)
{
	int result=solution("{[()()]}");
	if(result==1)
		System.out.println("This is valid nested string");
	else
		System.out.println("String is not properly nested");
}
}
	
	


