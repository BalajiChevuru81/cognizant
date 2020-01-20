class Volume
{
	int length;
	int width;
	int height;
	int boxvol;
	public Volume()
		{
			 length=10;
			 width=11;
			 height=13;
		}
	public void setDetails(int length, int width, int height)
		{
			this.length=length;
			this.width=width;
			this.height=height;
		}
	public void getdetails()
		{
			System.out.println("Length: "+length);
			System.out.println("Width: "+width);
			System.out.println("Height: "+heights);
			
		}
	public void calVolume()
		{
			boxvol=length*width*height;
		}
			
}		
				