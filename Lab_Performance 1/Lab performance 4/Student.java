import java.lang.*;
public class Student 
{

	int id=21448161;
	String name="Horish Das priyo";
	double cgpa=3.5;
	void displayInfo(){
		System.out.println("Student id : " +id);
		System.out.println("Student name : "+name);
		System.out.println("Student cgpa : "+cgpa);
	}
	public static void main(String [] args){
		Student s1=new Student();
		s1.displayInfo();
	}
	
		
	
}