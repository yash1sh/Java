class constructor_ex2
{
	String name;
	int no;
	String college_name;
	String address;
	

	constructor_ex2()
	{
	}
	constructor_ex2(String name)
	{
	this.name=name;
	}
	constructor_ex2(String name,int no)
	{
	this.name=name;
	this.no=no;
	}
	constructor_ex2(String name,int no,String college_name)
	{
	this.name=name;
	this.no=no;
	this.college_name=college_name;
	}
	constructor_ex2(String name,int no,String college_name,String address)
	{
	this.name=name;
	this.no=no;
	this.college_name=college_name;
	this.address=address;
	}
	
	public static void main(String [] arsgs)
	{
	constructor_ex2 e1=new constructor_ex2();
	constructor_ex2 e2=new constructor_ex2("Yash");
	constructor_ex2 e3=new constructor_ex2("Rahul",234234);
	constructor_ex2 e4=new constructor_ex2("Brangoli",2432,"balebale");
	constructor_ex2 e5=new constructor_ex2("wfwef",324234,"wewwr","wewefwf");
	System.out.println(e1.name+" "+e1.no+" "+e1.college_name+" "+e1.address);
	System.out.println(e2.name+" "+e2.no+" "+e2.college_name+" "+e2.address);
	System.out.println(e3.name+" "+e3.no+" "+e3.college_name+" "+e3.address);
	System.out.println(e4.name+" "+e4.no+" "+e4.college_name+" "+e4.address);
	System.out.println(e5.name+" "+e5.no+" "+e5.college_name+" "+e5.address);
	}
}