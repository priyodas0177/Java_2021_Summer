class Teacher extends Person
{
	private String id;
	private double salary;
	
	Teacher()
	{
	System.out.println("Inside child class");	
	}
	
	Teacher(String name,int age,String gender,String id,double salary)
	{
	super(name,age,gender);
	this.id=id;
	this.salary=salary;
	System.out.println("Inside child class param cons");	
	}
	Teacher(String id,double salary)
	{
	this.id=id;
	this.salary=salary;
	System.out.println("Inside child class param cons");	
	}
	Teacher(String id)
	{
		this.id=id;
	}
	
	Teacher(double salary)
	{
		this.salary=salary;
	}
	
	public void setId(String id)
	{
		this.id=id;
	}
	public void setSalary(double salary)
	{
		this.salary=salary;
	}
	public String getId()
	{
		return id;
	}
	public double getSalary()
	{
		return salary;
	}
	

}
