class increment3{
public static void main(String args[])
{
int a=10;
int b=20;
boolean c=(a++<b) || (a++<b);
System.out.println(c);
System.out.println(a);
System.out.println(b);
boolean d=(a++ > b) && (a++ < b);
System.out.println(c);
System.out.println(a);
System.out.println(b);
System.out.println(d);

}
}