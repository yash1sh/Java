import java.util.*;
class Branch
{
	Scanner s=new Scanner(System.in);
	private String mngrname;
	private String IFSC;
	Account1 a;
	public Branch(String mngrname)	
	{
		this.mngrname=mngrname;
		
		
	}
	public Branch(String mngrname,String IFSC)
	{
		this(mngrname);
		this.IFSC=IFSC;
	}
	public Branch(String mngrname,String IFSC,Account1 a)
	{
		this(mngrname,IFSC);
		this.a=a;
	}
	public String getmngrname()
	{
		return mngrname;
	}
	public String getIFSC()
	{
		return  IFSC;
	}
	public void setmngrname(String mngrname)
	{
		this.mngrname=mngrname;
	}
	public void createaccount()
	{
		System.out.println("Enter the account holder name");
		String accholdname=s.next();
		System.out.println("Enter the account number");
		int accno=s.nextInt();
		System.out.println("Enter the account balance");
		double accbal=s.nextDouble();
		this.a.setaccholdname(accholdname);
		this.a.setaccbal(accbal);
	}
	public void branchdetails()
	{
		System.out.println("manager name:"+mngrname);
		System.out.println("IFSC:"+IFSC);
	}
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter manager name:");
		String mngrname=s.next();
		System.out.println("Enter IFSC:");
		String IFSC=s.next();
		
			Branch b=new Branch(mngrname,IFSC,new Account1("lathesh",123456,120000));
		while(true)
		{
			System.out.println("1.create account\n2.branchdetails\n3.account details\n4.exit\n");
			System.out.println("Enter your choice");
			int choice=s.nextInt();
			switch(choice)
			{
				case 1:
					b.createaccount();
					break;
				case 2:
					b.branchdetails();
					break;
				case 3:
					b.a.accountdetails();
					break;
				case 4:
					System.exit(0);
				default:
					System.out.println("invalid input");
			}
		}
	}
}

		















	