class ArrayMul
{
	public static void main(String [] args)
	{
			int a[][]={{1,2,3},{2,3,1},{2,3,1}};
			int b[][]={{2,3,4},{3,4,2},{3,1,3}};
			int c[][]=new int[3][3];
			for(int i=0;i<3;i++)
			{
				for(int j=0;j<3;j++)
				{
				c[i][j]=0;
				for(int k=0;k<3;k++)
					{
				 	 c[i][j]=a[i][j]*b[i][j];
					}
				  System.out.print(c[i][j] +" ");
				}
				System.out.println();
			}
	}
}