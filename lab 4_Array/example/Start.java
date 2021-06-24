class Start
{
	public static void main(String args[])
	{
		Teacher t1=new Teacher("2",10000.0);
				
		t1.setName("Mashrafi");
		t1.setAge(37);
		t1.setGender("Male");
		
		System.out.println("Name is: "+t1.getName());
		System.out.println("Age is: "+t1.getAge());
		System.out.println("Gender is: "+t1.getGender());
		System.out.println("ID is: "+t1.getId());
		System.out.println("Salary is: "+t1.getSalary());
		
		Teacher t2=new Teacher();
		
		Teacher t3=new Teacher("Shakib",28,"Male","2",10000.0);
		System.out.println("Name is: "+t3.getName());
		System.out.println("Age is: "+t3.getAge());
		System.out.println("Gender is: "+t3.getGender());
		System.out.println("ID is: "+t3.getId());
		System.out.println("Salary is: "+t3.getSalary());
	
		
		
	}
}