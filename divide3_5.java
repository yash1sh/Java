import java.util.*;
class divide3_5
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a =sc.nextInt();
if(a%3==0)
System.out.println("Divisible by 3 ");
else if(a%5==0)
System.out.println("Divisible by 5");
else
System.out.println("Not divisible by both");
sc.close();
}
}