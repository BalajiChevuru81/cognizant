class Employee
{
	int id;
	String name;
	String branch;
	int fee;
		public void setDetails(int id, String name, String branch, int fee)
		{
			this.id=id;
			this.name=name;
			this.branch=branch;
			this.fee=fee;
		}
		public void getdetails()
		{
			System.out.println("ID: "+id);
			System.out.println("NAME: "+name);
			System.out.println("BRANCH: "+branch);
			System.out.println("FEE: "+fee);
		}
			public static void main(String [] args)
				{
					Employee e=new Employee();
					Employee e1=new Employee();
					e.setDetails(200,"uday","cse",5000);
					e1.setDetails(201,"anil","ece",6000);
					e.getdetails();
					e1.getdetails();
				}
}		
				