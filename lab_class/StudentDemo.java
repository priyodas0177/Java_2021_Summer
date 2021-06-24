import java.lang.*;
public class StudentDemo 
{
	private String name;
	private int id;
	private double cgpa;
	public StudentDemo(){
		
	}
	
	public StudentDemo(String n,int i,double cg){
		name=n;
		id=i;
		cgpa=cg;
	}
	void displayInfo(){
		System.out.println("Student name : " +name);
		System.out.println("Student id : "+id);
		System.out.println("Student cgpa : "+cgpa);
	}
	public void setName(String n){
		name=n;
	}
	public String getName(){
		return name;
	} 
	
	public void setId(int i){
		id=i;
	}
	public int getId(){
		return id;
	} 
	public void setCgpa(double c){
		cgpa=c;
	}
	public double getCgpa(){
		return cgpa;
	} 
	public static void main(String [] args){
		StudentDemo s1=new StudentDemo("Horish",21,3.56);
		s1.displayInfo();
		
		StudentDemo s2=new StudentDemo();
		s2.setName("Tamim");
		s2.setId(202);
		s2.setCgpa(3.88);
		System.out.println(s2.getName());
		System.out.println(s2.getId());
		System.out.println(s2.getCgpa());
	}
}

	
	