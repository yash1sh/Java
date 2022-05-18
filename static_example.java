class static_example
{
	static String name ="Yash";
	static int sal;
	static long cno=9238744;

	public static void EmployeeDetails()
	{
		System.out.println(name);
		System.out.println(sal);
		System.out.println(cno);
	}
	
	public static void main(String [] args)
	{
		System.out.println("prg started");
		EmployeeDetails();
		System.out.println("end");
	}
}