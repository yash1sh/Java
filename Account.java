



class Account {

	private String name;
	private int usn;
	private int age;
	private String surname;
	
	Account()
	{
	}
	
	Account(String name, int usn, int age, String surname)
	{
		this();
		this.name=name;
		this.usn=usn;
		this.age=age;
		this.surname=surname;
	}
	
	
	public void setname(String name)
	{
		this.name=name;
	}
	public void setusn(int usn)
	{
		this.usn=usn;
	}
	public void setage(int age)
	{
		this.age=age;
	}
	public void setsurname(String surname)
	{
		this.surname=surname;
	}
	
	public String getNamme()
	{
		return name;
	}
	public int getusn ()
	{
		return usn;
	}
	public int getage()
	{
		return age;
	}
	public String getsurname()
	{
		return surname;
	}

}
