class B
	{
	static int count=0;
	
	B()
	{
	count++;
	}
	public static void main(String [] arg)
	{
	B a=new B();
	B a1=new B();
	System.out.println(a1.count);
	}
}
