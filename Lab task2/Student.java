import java.lang.*;
public class Student 
{
	private String name;
	private int id;
	private double cgpa;
	public Student(){
		
	}
	
	public Student(String n,int i,double cg){
		name=n;
		id=i;
		cgpa=cg;
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
}	
	