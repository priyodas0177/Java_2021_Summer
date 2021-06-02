import java.lang.*;
public class person
{
	int id;
	String name;
	public person(){
		
	}
	public person (int i,String n){
		id=i;
		name=n;
	}
	void displayInfo(){
		System.out.println("id is :"+id);
		System.out.println("name is :"+name); 
	}
	public static void main( String args[])
	{
	person p1=new person(20,"priyo");
	p1.displayInfo();
	}
}