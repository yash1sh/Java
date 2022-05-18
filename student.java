import java.util.Scanner;
class student
{
	 String name;
	 String lastname;
	 int usn;
	 int age;

	student(String name,String lastname,int usn,int age)
	{
		this.name=name;
		this.lastname=lastname;
		this.usn=usn;
		this.age=age;

	}

	public String toString()
    {
        return "Name is"+name+"\nLast name is "+lastname+"\nusn is "+usn+"\n Age is"+age;
    }

	// name="Yash";
	// usn="4al19is048";
	// age='m';


	// }
	
	// public static void studentdetails()
	// {
	// 	System.out.println("The Student details are");
	// 	System.out.println("Name ="+name);
	// 	System.out.println("Usn ="+usn);
	// 	System.out.println("Age:"+age);
	// }

	// public static void principle()
	// {
	// 	Scanner sc=new Scanner(System.in);
	// 	System.out.println("Enter the principle name");
	// 	pname=sc.nextLine();
	// 	System.out.println("Principle name ="+pname);
	// }

	// public static void main(String []args)
	// {
	// 	Scanner sc =new Scanner(System.in);
	// 	studentdetails();
	// 	principle();
	// }
}

		