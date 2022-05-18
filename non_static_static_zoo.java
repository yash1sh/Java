import java.util.Scanner;
class non_static_static_zoo
{
	String place="Bangalore";
	String name="Gutar gutar zoo";
	int number=69;
	int worker_number=99;
	
	static{
			System.out.println("Welcome to Zoo details section");
			System.out.println("---------------------------");
		}
	public void id()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the id ");
		int b=sc.nextInt();
	}
	
	public void Bye()
	{
	System.out.println("Thanks you now get lost");
	}
	
	public static void err()
	{
	System.out.println("You cant enter here");
	}
	
	public static void main(String []args)
	{
		non_static_static_zoo bb =new non_static_static_zoo();
		bb.id();
		bb.err();
		System.out.printf("Place = "+bb.place+"\n Zoo Name = "+bb.name+"\n Number of animals "+bb.number+"\n Number of workser is "+bb.worker_number);
	}
}
	