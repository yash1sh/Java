









class Shop
{
	private int tomato=5;
	private int potato=10;
	private int cabage=10;
	private int carrot=20;
	private String shop_manager="Varshith";

	
	
	public void setveg(int tomato)
	{
		this.tomato=tomato;
	}
	
	public void setveg2(int potato)
	{
		this.potato=potato;
	}
	
	public void setveg3(int cabage)
	{
		this.cabage=cabage;
	}
	
	public void setveg4(int carrot)
	{
		this.carrot=carrot;
	}
	
	public void setshop_manager(String shop_manager)
	{
		this.shop_manager=shop_manager;
	}
	//------------------------------------------------------------------------//
	public int getveg1()
	{
		return tomato;
	}
	
	public int getveg2()
	{
		return potato;
	}
	
	public int getveg3()
	{
		return cabage;
	}
	
	public int getveg4()
	{
		return carrot;
	}
	
	public String getveg5()
	{
		return shop_manager;
	}
	
	
	
}

class Shopgetset {

		public static void main(String args[])
		{
			Shop s=new Shop();
			System.out.printf("The number of veg are\ntomato is "+s.getveg1()+"\npotato are"+s.getveg2()+"\ncabage are "+s.getveg3()+"\ncarrot is "+s.getveg4()+"\nShop Manager is "+s.getveg5()+"\n");
			s.setveg(12);
			s.setveg2(13);
			s.setveg3(14);
			s.setveg4(15);
			s.setshop_manager("Yash");
			System.out.println("------------------------------------------------------------------------------------");
			System.out.printf("The number of veg are\ntomato is "+s.getveg1()+"\npotato are"+s.getveg2()+"\ncabage are "+s.getveg3()+"\ncarrot is "+s.getveg4()+"\nShop Manager is "+s.getveg5());
			
		}
	


}
