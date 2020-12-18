package Demo11;

import java.util.*;
import java.util.HashSet;

public class DistinctArray {
	public static int solution(int[] A)
	{
		HashSet<Integer> set=new HashSet<Integer>();
		for(int i=0;i<A.length;i++)
		{
			set.add(A[i]);
		}	
			return set.size();
	}
		
		public static void main(String[] args)
		{
			int arr[]= {2,3,4,4,1,1,2,5};
			System.out.println(solution(arr));
		}
	}


