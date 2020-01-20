class BankEmployee
{
	int empId,salary; 
	String empName;
	public void setEmpDetails(int empId1,String empName1,int salary1)
		{
			empId=empId1;
			empName=empName1;
			salary=salary1;
		}
	void getEmpDetails()
		{
			System.out.println(" id: "+empId);
			System.out.println(" name: "+empName);
			System.out.println(" salary: "+salary);
		}
	
}