class Person
{
	private String name;
	private int age;
	private String gender;
	Person()
	{
	
	System.out.println("Inside parent class");	
	
	}
	Person(String name,int age,String gender)
	{
			
		this(name,age);
		this.gender=gender;
	}
	Person(String name,int age)
	{
		this.name=name;
		this.age=age;
	
	}


	public void setName(String name)
	{
		this.name=name;
	}
	public void setAge(int age)
	{
		this.age=age;
	}
	public void setGender(String gender)
	{
		this.gender=gender;
	}
	public String getName()
	{
		return name;
	}
	public int getAge()
	{
		return age;
	}
	public String getGender()
	{
		return gender;
	}
	
}
