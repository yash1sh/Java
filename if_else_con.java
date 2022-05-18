import java.util.Scanner;
class if_else_con
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter 2 value");
		int a =sc.nextInt();
		int b=sc.nextInt();
		if(a>b)
			System.out.println("1st is greater");
		else
			System.out.println("2nd is greater");
	}
}