class Narrowing
{
	public static void main(String args[])
{
	int d=(short)4.8d;
	int d1=(int)(short)(int)(float)(long)5.8d;
	System.out.println(d);
	System.out.println(d1);
	
}
}