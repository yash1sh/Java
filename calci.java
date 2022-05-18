import java.util.Scanner;
class calci
{
	public static void add(int a,int b)
	{
		System.out.println(a+b);
	}

	public static void sub(int a,int b)
	{
		if(a>b)
		 	System.out.println(a-b);
		else
			System.out.println(b-a);
	}

	public static void mul(int a,int b)
	{
		System.out.println(a*b);
	}

	public static void div(int a,int b)
	{
		if(a>b)
			System.out.println(a/b);
		else
			System.out.println(b/a);
	}

	public static void main(String[] args)
	{
		while(true)
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the First value");
			int a =sc.nextInt();
		
			System.out.println("Enter the Second value");
			int b=sc.nextInt();		
		
			System.out.println("choice");
			System.out.println("1) Addition 2) Sub 3) Mul	4) div ");
			int ch=sc.nextInt();

		
		switch(ch)
		{
			case 1:
			System.out.println("The addition is =");
			add(a,b);
			break;
		
			case 2:
			System.out.println("The substraction is=");
			calci.sub(a,b);				//Using class_name
			break;
		
			case 3:
			System.out.println("The Multiplication is =");
			mul(a,b);
			break;

			case 4:
			System.out.println("The div is =");
			div(a,b);
			break;
		}
		}
	}
}		
		