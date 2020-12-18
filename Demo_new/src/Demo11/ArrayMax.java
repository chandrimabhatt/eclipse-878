package Demo11;



public class ArrayMax {
	public static int max(int[] A)
	{
		int max=0;
		int ar1[] = null;
		for(int i=0;i<A.length;i++)
		{
			if(A[i]>0)
			{	
			  ar1[i]  =A[i];
				max=ar1[i];
			}
		}
		return max;
	}
public static void main(String[] args)
{
int arr[]= {2,9,10,7,100,222,567};
System.out.println(max(arr));
}
}
