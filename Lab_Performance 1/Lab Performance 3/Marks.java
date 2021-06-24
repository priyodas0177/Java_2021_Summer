import java.lang.*;
public class Marks
{
	public static void main(String[] args){
		String name="priyo";
		double marks=73;
		String grade;
		
		System.out.println("My name is :" +name);
		System.out.println("My Marks is :" +marks);
		
		if(marks>=90){
			grade="A+";
			System.out.println("My letter grade is : " +grade);
		}
		else if ((marks<=89) &(marks>=85)){
			grade="A";
			System.out.println("My letter grade is : " +grade);
		}
		else if((marks<=84) &(marks>=80)){
			grade="B+";
			System.out.println("My letter grade is : " +grade);
		}
		else if((marks<=79) &(marks>=75)){
			grade="B";
			System.out.println("My letter grade is : " +grade);
		}
		else if((marks<=74) &(marks>=70)){
			grade="C+";
			System.out.println("My letter grade is : " +grade);
		}
		else if((marks<=69) &(marks>=65)){
			grade="C";
			System.out.println("My letter grade is : " +grade);
		}
		
		
		
		
	
	
	}
	
	
}