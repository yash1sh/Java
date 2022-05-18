
class book_my_show
{
	String name="Yash";
	int ticket_no =129291;
	String show_name="katapa";
	int show_time=6;
	static{
		System.out.println("Welcome to the hall");
		System.out.println("hello");
		System.out.println("whats your name");
		System.out.println("Can you show me your ticket");
	}

	public String toString()
	{
		return "Name ="+name+"\n ticket no = "+ticket_no+"\n Show name and timing : "+show_name+" "+show_time;
	}
	
	public void ticket_deatils()
	{
	book_my_show bb=new book_my_show();
	System.out.println(bb);
	}
	
	public void enter()
	{
	System.out.println("\n Yes show is confirmed and your seat has been aloted");
	}
	
	public static void main(String [] args)
	{
		book_my_show bb = new book_my_show();
		bb.ticket_deatils();
		bb.enter();
	}
}
