class ArrayExample
{
	public static void main(String [] args)
	{
		int arr[]={10,12,14,56};
		int []arr1={23,34,45,87};
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		for(int i:arr1)
			{
			System.out.println(i);
			}
	}
}