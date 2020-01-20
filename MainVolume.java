class MainVolume
{
	public static void main(String [] args)
	{
		Volume v=new Volume();
		v.getdetails();
		v.calVolume();
		System.out.println(v.boxvol);
		v.setDetails(20,50,10);
		v.getdetails();	
		//Volume v1=new Volume();
		v.calVolume();	
		System.out.println(v.boxvol);		
	}
}