package Demo11;

public class PassingCars {
	public static int solution(int[] A)
	{
		int carsTravellingeast=0;
		int passingCars=0;
		 int n=A.length;
		 for(int i=0;i<n;i++)
		 {
			 if(A[i]==0)
			 {
				carsTravellingeast++;
			 }
			  if(A[i]==1)
			 {
				 passingCars=passingCars+carsTravellingeast;
			 }
		 } 
			 if(passingCars>1_000_000_000||passingCars<0)
				 return -1;
			 else
				 return passingCars;
		 
	}
		public static void main(String[] args)
		{
		int arr[]= {0,1,0,1,1};
		System.out.println(solution(arr));
		
	}

}
