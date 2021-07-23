public class Start
{
	public static void main(String args[])
	{
		
	
		Person p1=new Person("shakib",31);
		Student s1=new Student(); //display1(),display2(),display()
		
		s1.display();
		s1.display2();
		s1.display1();
		
		Person p2=new Student();
		
		p2.display1(); 
		p2.display();
		
		//p2.display2();
	
	/*	
	
	Person p1=new Student();
	Student s1=new Student();
	
	
	s1= (Student)p1;
	
	s1.display2();
	s1.display1();
	s1.display();
	*/
	}
}