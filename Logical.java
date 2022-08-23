class Logical{
public static void main(String args[])
{
	int a=10;
	int b=20;
	boolean c=b>a,d=b>=a;
	System.out.println(a+" "+b);
	System.out.println(c+" "+d);
	c=(a>b)&&(c&&d);
	d=(a<b)&&(c&&d);
	System.out.println(c+" "+d);
}
}