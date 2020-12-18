package Demo11;

public class CountDiv {
	public static int solution(int A,int B,int K)
	{
		if(K==0)
            return 0;
        
        int left = A/K;//no of nos divisible by 6
        int right = B/K;//no of nos divisibe by 11
        int modLeft = A%K;
        int modRight = B%K;
        
        if((modLeft==0 || modRight==0))
            return (int)(Math.ceil((B-A)/K +1)) ;
        
        return right-left;    
    }
	public static void main(String[] args)
	{
		System.out.println(solution(7,11,2));
		
	}

}
