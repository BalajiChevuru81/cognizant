class Student
{
	int rollNo;
	String name;
	String branch;
	public Student()
	{
		rollNo=10;
		name="Balaji";		
		branch="cse";
	}
	public void setStudent(int rollNo1, String name1, String branch1)
	{
		rollNo=rollNo1;
		name=name1;
		branch=branch1;
	}
	void getStudent()
	{
		System.out.println("Roll No.:"+rollNo);
		System.out.println("Name:"+name);
		System.out.println("Branch:"+branch+"\n");
	}
}