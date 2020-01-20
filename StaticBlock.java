//static block

class StaticBlock
{
 	static int a;
	static 
	{
		a=10;
		System.out.println("static block called"+a);
	}
	static void setA(int a)
	{
		a=56;
		System.out.println("static method called"+a);
	}
	public static void main(String [] arg)
	{
		System.out.println("main method");
		setA(10);
	}
}
