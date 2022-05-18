

class Car
{
	String color;
	String brand;
	int price;
	engine e;
	Car(String color,String brand,int price,engine e)
	{
		this.color=color;
		this.brand=brand;
		this.price=price;
		this.e=e;
	}
}

class engine
{
	int eng_no;
	int cc;
	engine(int eng_no,int cc)
	{
		this.cc=cc;
		this.eng_no=eng_no;
	}
}

class cardriver {
		public static void main(String ags[])
		{
			Car c=new Car("Red","lauda",876876,new engine(12212,121));
			System.out.printf("The eng no is "+c.e.eng_no+"\nthe color is "+c.color+"\nThe brand is "+c.brand);
		}
		
	}


