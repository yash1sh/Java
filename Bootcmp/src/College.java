
import java.util.Scanner;
class Student
{
	String name;
	String usn;
	String gender;
	int number;
	Student(String name,String usn,String gender,int number)
	{
		this.name=name;
		this.usn=usn;
		this.gender=gender;
		this.number=number;
	}

	public String toString()
	{
		return "Name is "+name+"\nUsn is "+usn+"\nGender is "+gender+"\nnumber is "+number;
	}
}


class college_details
{
	String name;
	String princi_name;
	String loc;
	int area_of_college;
	Student s;
	
	college_details(String name,String princi_name,String loc,int area_of_college)
	{
		this.name=name;
		this.princi_name=princi_name;
		this.loc=loc;
		this.area_of_college=area_of_college;
	}
	
	public void EnterStudent()
	{
		if(this.s==null) 
		{
			this.s=new Student("Yash","4al19","male",2938423);
			System.out.println("Student entry is done");
		}
		else
			System.out.println("Student is present");
	}
	public void CancelStudent()
	{
		if(this.s!=null)
		{
			this.s=null;
			System.out.println("Student is ccancelled");
		}
		else
			System.out.println("Student deatils are no there");
	}
	public void displayStudent()
	{
		if(this.s==null)
			System.out.println("No details available");
		else
		System.out.println(s);
	}
	public void displayCollege()
	{
		System.out.printf("Name is "+name+"\nprinciple name is "+princi_name+"\nloction  is "+loc+"\nSize of college in area  "+area_of_college+"\n");
	}
}
class College 
{
	public static void main(String args[])
	{
	int ch;
	boolean exit=true;
	Scanner sc=new Scanner(System.in);
	college_details cd=new college_details("Alvas","Vishesh","moodubidri",393);
	while(exit)
	{
		System.out.println("Enter your choice");
		System.out.println("1)Student enter \n2)Cancel Student\n3)displayStudent\n4)displayCollege\n5)exit");
		ch=sc.nextInt();
		switch(ch)
		{
		case 1:
			cd.EnterStudent();
			break;
		case 2:
			cd.CancelStudent();
			break;
		case 3:
			cd.displayStudent();
			break;
		case 4:
			cd.displayCollege();
			break;
		case 5:
			exit=false;
			break;
		default:
			System.out.println("invalid details");
			
		}
	}
	}
}


