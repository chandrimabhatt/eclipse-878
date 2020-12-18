package Demo11;

import java.util.Arrays;

public class MaxProduct {
	public static int solution(int[] A)
	{
		int N=A.length;
		Arrays.sort(A);
		return (A[N-3]*A[N-2]*A[N-1]);
	}
	public static void main(String[] args)
	{
		int arr[]= {-3,1,4,-2,5,6};
		System.out.println(solution(arr));
	}
}
