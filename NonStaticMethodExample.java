

class NonStaticMethodExample
{
	static int num;   
	int a;		
	public void setstatic(int a) 
	{
		num=a;
		System.out.println(num);
	}
	public static void main(String [] args)
	{
		setstatic(10);
	}
}