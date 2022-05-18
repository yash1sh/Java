class empp
{
	static String surname="Shetty";
	String name ="YAsh";
	String Age="MALE";
	static int no=2836462;
	
	public void play()
	{
	System.out.println("HHHIii");
	}
	
	public static void bye()
	{
	System.out.println("Bye");
	}

	public static void main(String []args)
	{
		empp ex=new empp();
		ex.play();
		System.out.println(ex.name+" " +surname);
		System.out.println("Gender is "+ex.Age+" No is "+no);
		bye();
	}
}