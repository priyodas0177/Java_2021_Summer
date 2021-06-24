import java.lang.*;
public class Student 
{

	String name;
	String id;
	double cgpa;
	static int count=0; 
	public Student(){
		count++;
	}
	public Student(String n,String i,double c){
		name=n;
		id=i;
		cgpa=c;
		count++;
	}
	void displayInfo(){
		System.out.println("Student name : " +name);
		System.out.println("Student id : "+id);
		System.out.println("Student cgpa : "+cgpa);
	}
	public static void main(String [] args){
		Student s1=new Student("Horish","12",3.56);
		s1.displayInfo();
		Student s2=new Student("priyo","14",3.58);
		s2.displayInfo();
		Student s3=new Student("mostak","16",3.59);
		s3.displayInfo();
		System.out.println("Object" +count);
		
	}
	
		
	
}