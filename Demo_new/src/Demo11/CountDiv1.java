package Demo11;

public class CountDiv1 {
	public static int solution(int A,int B,int K)
	{
		int i=A;
		int ct=0;
		while(i<=B)
		{
			if(i%K==0)
			{
				ct++;
				ct=ct+(B-i)/K;
				break;
			}else
			{
				i++;
			}
		}
		return ct;
	}
	public static void main(String[] args)
	{
		System.out.println(solution(7,11,2));
	}

}
