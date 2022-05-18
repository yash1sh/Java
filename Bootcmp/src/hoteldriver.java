
import java.util.Scanner;
class sugy
{
	String ord;
	double price;
	String loc;
	sugy(String ord,double price,String loc)
	{
		this.ord=ord;
		this.price=price;;
		this.loc=loc;

	}
	public String toString()
	{
		return "order is "+ord+"\nPrice is "+price+"\nLocation is "+loc;
	}
	
}
class hotel {
			int capacity;
			String name;
			String owner ;
			sugy e;
		hotel(int capacity,String name,String owner)
		{
			this.capacity=capacity;
			this.name=name;
			this.owner=owner;
		}
			public void ordeer()
			{
				this.e=new sugy("samosa",777,"bangaore");
				System.out.println("Order place");
			}
			
			
			public void cancelorder()
			{
				this.e=null;
				System.out.println("Order cancel");
			}
			public void display()
			{
				System.out.println(e);
			}
			
}
			
			class hoteldriver
			{
				public static void main(String atgs[])
				{
					hotel e1=new hotel(2323,"yajs","varshirt");
					Scanner sc=new Scanner(System.in);
					while(true)
					{
					System.out.println("\nEnter the choice");
					System.out.println("1)order\n2)Cancel\n3)display \n4)hotel details");
					int ch=sc.nextInt();
					switch(ch)
					{
					case 1:
						e1.ordeer();
						break;
					case 2:
						e1.cancelorder();
						break;
					case 3:
						e1.display();
						break;
					case 4:
						System.out.printf("Capacity is "+e1.capacity+"\nName of owner "+e1.name+"\nOwner is "+e1.owner);
						break;
					default:
						System.out.println("Please type properly");
					}
					}
				}
			}
