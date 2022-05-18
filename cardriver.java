

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

	public String toString()
	{
		return "The eng no is "+e.eng_no+"\nthe color is "+color+"\nThe brand is "+brand;
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
			System.out.println(c);
		}
		
	}


