class constructor_ex1
{
	int a;
	int b;
	int c;

	constructor_ex1()
	{
		a=9;
		b=10;
	}
	constructor_ex1(int a,int b)
	{
	this.a=a;
	this.b=b;
	}
	
	constructor_ex1(int k,int r,int c)
	{
	a=k;
	b=r;
	this.c=a-b;
	int d=a+b;
	System.out.println("d = "+d);
	}
	
	public static void main(String [] args)
	{
		constructor_ex1 e1= new constructor_ex1(9,10);
		System.out.println(e1.a+" "+e1.b);
		constructor_ex1 e2=new constructor_ex1();
		System.out.println(e2.a+" "+e2.b);
	constructor_ex1 e3=new constructor_ex1(5,4,0);
		System.out.println(e3.a+" "+e3.b+" "+e3.c+" ");
	
	
	}
}