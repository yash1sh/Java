class railway
{
	static String source="mumbai";
	static String destination="Mangalore";
	static int train_no=123;
	static int platform=69;
	static int ticketprice=2000;
	public static void details()
	{
		System.out.println("Source ="+source);
		System.out.println("destination ="+destination);
		System.out.println("number ="+train_no);
		System.out.println("Price="+ticketprice);
		System.out.println("Platform"+platform);
	}
	
	public static void main(String [] args)
	{
		System.out.println("started ");
		details();
		System.out.println("End");
	}
}
