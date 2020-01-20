import java.util.*;
class Calculator
{
	public void add(int a, int b)
	{
		//int sum=a+b;
		System.out.println(a+b);
	}
	public void sub(int a, int b)
	{
		//int su=a-b;
		System.out.println(a-b);
	}
	public void mul(int a, int b)
	{
		//int mu=a*b;
		System.out.println(a*b);
	}
	public void div(int a, int b)
	{
		//int di=;
		System.out.println(a/b);
	}
	public static void main(String [] args)
		{

		Calculator c=new Calculator();
		Scanner s=new Scanner(System.in);
		//Scanner s1=new Scanner(System.in);
		System.out.println("enter nos for operations");
		
		int x=s.nextInt();
		int y=s.nextInt();

		System.out.println("Enter the method 1.add,2.sub,3.mul,4div");
		int n=s.nextInt();
		switch(n)
		{
		case 1: c.add(x,y);
			break;
		case 2: c.sub(x,y);
			break;
		case 3: c.mul(x,y);
			break;
		case 4 : c.div(x,y);
			break;
		default: System.out.println("enter the number");
		}
		}
}
		