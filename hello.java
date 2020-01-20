class Hello
{
	static int count=0;
	int a;
	double b;
	String c="xyz";
	char d= 'a';
	Hello()
	{
		count++;
	}
		
		
	
	public static void main(String [] args)
	{
		Hello a1=new Hello();
		Hello a2=new Hello();
		Hello a3=new Hello();
		System.out.println(count);
		System.out.println(a1.a);
		System.out.println(a2.b);
		System.out.println(a3.c);
		System.out.println(a2.d);	
	}

}