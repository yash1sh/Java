class Account1
{
	private String accholdname;
	private int accno;
	private double accbal;
	public Account1(String accholdname)
	{
		this.accholdname=accholdname;
	}
	public Account1(String accholdname,int accno)
	{
		this(accholdname);
		this.accno=accno;
	}
	public Account1(String accholdname,int accno,double accbal)
	{
		this(accholdname,accno);
		this.accbal=accbal;
	}
	public String getaccholdname()
	{
		return accholdname;
	}
	public int getaccno()
	{
		return accno;
	}
	public double getaccbal()
	{
		return accbal;
	}
	public void setaccholdname(String accholdname)
	{
		this.accholdname=accholdname;
	}
	public void setaccbal(double accbal)
	{
		this.accbal=accbal;
	}

	public void accountdetails()
	{
		System.out.println("Account holder name:"+accholdname);
		System.out.println("Account number:"+accno);
		System.out.println("Account balance:"+accbal);
	}
}
	
		