package Demo11;
import java.util.List;
import java.util.ArrayList;


public class LambaExp {
	public static void main(String[]args)
	{
		List <Integer> idList=new ArrayList<Integer>();
		idList.add(4);
		idList.add(12);
		idList.add(13);
		idList.add(6);
		idList.add(8);
		idList.forEach((n)->System.out.println(n));
		
		
	}
}
