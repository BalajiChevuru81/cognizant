//static method and class method

class StaticMethodExample
{
	static int num;  //static variable 
	int a;		//non static variable and instant variable
	static void setstatic(int a) //static method 
	{
		num=a;
		System.out.println(num);
	}
	public static void main(String [] args)
	{
		setstatic(10);
	}
}