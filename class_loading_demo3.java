class class_loading_demo3
{
	public static void sita()
	{
		System.out.println("Sita Started ");
		ram();
		System.out.println("Sita ended");
	}
	
	public static void ram()
	{
		System.out.println("Ram Started");
		laxman();
		System.out.println("Ram ended");
	}

	public static void laxman()
	{
		System.out.println("laxman Started ");
		System.out.println("laxman ended");
	}
	
	public static void main(String[] args)
	{
	System.out.println("MAin Started");
	ram();
	System.out.println("main ended");
	}
}
	