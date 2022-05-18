import java.util.Scanner;
class non_static_acc
{
	int acc_no;
	String ifsc;
	String name;
	int amt;
static 
	{
	System.out.println("Welcome to bank");
	System.out.println("---------------------");
	}
	
	public void my_acc(non_static_acc bb)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your acc details");
		System.out.println("Enter acc no");
		bb.acc_no=sc.nextInt();
		System.out.println("Enter ifse");
		bb.ifsc=sc.next();
		System.out.println("Enter name in card or acc");
		bb.name=sc.next();
		System.out.println("Enter the amount");
		bb.amt=sc.nextInt();
	}
	
	
	public static void other_acc(non_static_acc bb)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter other acc details");
		System.out.println("Enter acc no");
		bb.acc_no=sc.nextInt();
		System.out.println("Enter ifse");
		bb.ifsc=sc.next();
		System.out.println("Enter name in card or acc");
		bb.name=sc.next();
		System.out.println("Enter the amount");
		bb.amt=sc.nextInt();
	}
	
	public static void main(String [] args)
	{
		non_static_acc bb=new non_static_acc();
		bb.my_acc(bb);
		other_acc(bb);
		System.out.println("Done");
	}
}
	
	