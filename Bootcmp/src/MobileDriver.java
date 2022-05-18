class mobile
{
	String mob_brand;
	int mob_price;
	String mob_color;
	String mob_owner;
	String mob_os;
	sim sim;
	
	mobile(String mob_brand,int mob_price,String mob_color,String mob_owner,String mob_os,sim sim)
	{
		this.mob_brand=mob_brand;
		this.mob_price=mob_price;
		this.mob_color=mob_color;
		this.mob_owner=mob_owner;
		this.mob_os=mob_os;
		this.sim=sim;
	}
	public String toString()
	{
		return "The Sim no for the mobile "+mob_brand+" is "+sim.sim_no;
	}
}
class sim
{
	int sim_no;
	String brand;
	
	sim(int sim_no,String brand)
	{
		this.sim_no=sim_no;
		this.brand=brand;
	}
}
class MobileDriver {
		public static void main( String argsp[])
		{
			mobile mob=new mobile("Oppo",20000,"red","Vishesh","Andriod",new sim(9287,"Airtel"));
			System.err.println(mob);
	
	
	}

}
