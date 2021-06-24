public class StudentMain{
	public static void main(String [] args){
		Student s1=new Student("Horish",21,3.56);
		
		
		Student s2=new Student();
		s2.setName("Tamim");
		s2.setId(202);
		s2.setCgpa(3.88);
		System.out.println(s2.getName());
		System.out.println(s2.getId());
		System.out.println(s2.getCgpa());
	}
}