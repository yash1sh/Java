class increment{
public static void main(String args[])
{
	int a=10;
	a=a++ + ++a + 10+ ++a +11;
	System.out.println(a);
	a=10;
	int b=20;
	int c=30;
	c=a+b++ + c-- + --c + ++b + --a +a;
	System.out.println(c);
}
}