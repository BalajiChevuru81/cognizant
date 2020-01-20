import java.util.*;
class ArrayMinMax
{
	public static void main(String [] args)
	{
		int min,max,temp=0;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the size of the element");
		int n=s.nextInt();
		int[] a=new int[n];
		System.out.println("enter the elements");
		for(int i=0;i<=n;i++)
		a[i]=s.nextInt();
		int k=0;
		a[k]=temp;
		for(int j=1;j<n;j++)
		{
			if(a[j]<temp)
			temp=a[j];
		}
		System.out.println("min element is " +temp);
			a[k]=temp;
			for(int j=1;j<n;j++)
			{
				if(a[j]>temp)
				temp=a[j];
			}
			System.out.println("the max elements is" +temp);
	}
}	