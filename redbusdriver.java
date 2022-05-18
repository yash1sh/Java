
import java.util.Scanner;
class Redbus
{
	int busno;
	String busname;
	tickett t;
	
	Redbus(int busno)
	{
		this.busno=busno;
	}
	
	Redbus(int busno,String busname)
	{
		this(busno);
		this.busname=busname;
	}
	
	public void Bookticket()
	{
		if(this.t==null)
		{
			Scanner s=new Scanner(System.in);
			System.out.println("Enter the ticket number");
			int tick_no=s.nextInt();
			System.out.println("Enter the arrival place");
			String arrival_place=s.next();
			System.out.println("Enter the departure place");
			String dep_place=s.next();
			System.out.println("Enter the number of tickets");
			int no_of_ticket=s.nextInt();
			this.t=new tickett(tick_no,arrival_place,dep_place,no_of_ticket);
		}
		else
		{
			System.out.println("Ticket is already booked");
		}
	}
	
	public void ticketdetail()
	{
		if(this.t!=null)
		{
			System.out.println(t);
		}
		else
		{
			System.out.println("No tickets are booked");
		}
	}	
	public void updatearrival()
	{
		if(this.t!=null)
		{
			Scanner s=new Scanner(System.in);
			System.out.println("Enter the arrival place");
			String arrival_place=s.next();
			this.t.setarrival(arrival_place);
		}
		else
		{
			System.out.println("No data to update");
		}
	}

	public void updatedeparture()
	{
		if(this.t!=null)
		{
			Scanner s=new Scanner(System.in);
			System.out.println("Enter the arrival place");
			String dep_place=s.next();
			this.t.setdep(dep_place);
		}
		else
		{
			System.out.println("No data to update");
		}
	}
	
	public void Redbusdetail()
	{
		System.out.println("Bus name is :"+busname);
		System.out.println("Bus number is:"+busno);
	}
	
	public void cancelticket()
	{
		if(this.t!=null)
		{
			this.t=null;
			System.out.println("Ticket is cancelled");
		}
		else
		{
			System.out.println("No ticket to cancel");
		}
	}
}




class tickett
{
	private int tick_no;
	private String arrival_place;
	private String dep_place;
	private int no_of_ticket;
	


	public String toString()
	{
		return "ticket no "+tick_no+"\nArrival Place "+arrival_place+"\nDEpartment place "+"\nNumber of ticket"+no_of_ticket;
	}
	tickett(int tick_no)
	{
		this.tick_no=tick_no;
	}
		
	tickett(int tick_no,String arrival_place)
	{
		this(tick_no);
		this.arrival_place=arrival_place;
	}
	
	tickett(int tick_no,String arrival_place,String dep_place)
	{
		this(tick_no,arrival_place);
		this.dep_place=dep_place;
	}

	tickett(int tick_no,String arrival_place,String dep_place,int no_of_ticket)
	{
		this(tick_no,arrival_place,dep_place);
		this.no_of_ticket=no_of_ticket;
	}
	
	public void settickno(int tick_no)
	{	
		this.tick_no=tick_no;
	}
	
	public void setarrival(String arrival_place)	
	{
		this.arrival_place=arrival_place;
	}
	
	public void setdep(String dep_place)
	{
		this.dep_place=dep_place;
	}
	
	public void setticket(int no_of_ticket)
	{
		this.no_of_ticket=no_of_ticket;
	}

	public int gettickno()
	{
		return tick_no;
	}
	
	public String getarrival()
	{
		return arrival_place;
	}
	
	public String getdep()
	{
		return dep_place;
	}
	
	public int getticket()
	{
		return no_of_ticket;
	}
}





class redbusdriver
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the bus name");
		String busname=s.next();
		System.out.println("Enter the bus number");
		int busno=s.nextInt();
		Redbus r=new Redbus(busno,busname);
		boolean exit=true;
		while(exit)
		{
			System.out.println("choose the below option");
			System.out.println("1.Bookticket\n2.ticket detail\n3.update arrival detail\n4.update departure detail\n5.Redbus detail\n6.cancelticket\n7.Exit");
			int choice=s.nextInt();
			switch(choice)
			{
				case 1:r.Bookticket();
					break;
				case 2:r.ticketdetail();
					break;
				case 3:r.updatearrival();
					break;
				case 4:r.updatedeparture();
					break;
				case 5:r.Redbusdetail();
					break;
				case 6:r.cancelticket();
					break;
				case 7:exit=false;;
				default:System.out.println("Choose the correct option option");
			}
		}
	}
}