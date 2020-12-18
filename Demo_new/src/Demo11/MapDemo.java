package Demo11;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
class Student{
	int rollno;
	String name;
	int age;
	public Student() {
		super();
	}
	public Student(int rollno, String name, int age) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}

public class MapDemo {
public static void main(String[] args)
{
	Map map=new HashMap();
	
	map.put(1,"Amit");
	map.put(5, "Rahul");
	map.put(2,"jay");
	map.put(6, "Rohan");
	System.out.println(map);
	
	System.out.println("Using Iterators:");
	Set set=map.entrySet();
	Iterator itr=set.iterator();
	
	while(itr.hasNext())
	{
		Map.Entry entry=(Map.Entry) itr.next();
		System.out.println(entry.getKey()+" "+entry.getValue());
	}
	
	
	
}
}
