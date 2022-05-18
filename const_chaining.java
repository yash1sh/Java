class const_chaining
{
	String name;
	int id;
	int no;
	const_chaining(){}
	const_chaining(String name)
	{
		this.name=name;
	}
	const_chaining(String name,int id)
	{
		this(name);
		this.id=id;
	}
	const_chaining(String name ,int id,int no)
	{
		this(name,id);
		this.no=no;
	}
	
	public static void main(String [] args)
	{
	System.out.println("Program Started");	
	const_chaining s1=new const_chaining("yash");
	const_chaining s2=new const_chaining("yash",98238);
	const_chaining s3=new const_chaining("xkajsbx",92731,19837);
	System.out.println(s1.name+" 2nd "+s2.name);
	System.out.println(s1.name+" "+s2.name+"  "+s3.name+" "+s2.id+" "+s3.id+" "+s3.no);
	System.out.println("Program ended");
	
	}
}
