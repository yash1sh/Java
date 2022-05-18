class class_loading_demo4
{
	
	public static void m1()
	{
		System.out.println("m1Started");
		m2();
		System.out.println("m1ended");
	}

	public static void m2()
	{
		System.out.println("m2Started ");
		System.out.println("m2ended");
	}
	
	public static void main(String[] args)
	{
	System.out.println("MAin Started");
	m1();
	m2();
	System.out.println("main ended");
	}
}
	