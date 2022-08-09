
import java.util.*;



public class abdriver {

static int a=20;

static 
{
    a=10;
}
static 
{
    a=a++;
    System.out.println(a);
}

    public static void m1()
{
    try
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("num 1");
            int a=sc.nextInt();
            System.out.println("num 2");
            int b=sc.nextInt();
            System.out.println("Division is "+a/b);
            sc.close();
        }
        catch(ArithmeticException e)
        {
            System.err.println("Entered value is not proper");
        }

}

    public void bh(int i,double j)
    {
        System.out.println(i+" "+(int)j);
    }

    public static void main(String [] args)
    {
        char a='8';
        int b=010;
        System.out.println(a+b);
        Scanner sc=new Scanner(System.in);
        abdriver ab = new abdriver();
        ab.bh(a,b);
        System.out.println("hahha");

        ArrayList al=new ArrayList();
        al.add(sc.nextInt());
        al.add("Yash");
        al.add(true);
        al.add('c');
        al.add(10.0);
        al.add(10000);
        // al.remove(1);
        // al.remove(5);
        System.out.println("The ans for arraylist");
        
        System.out.println();
        System.out.println(al.isEmpty());
        System.out.println(al.size());
        al.toArray();
        System.out.println();
        System.out.println(al.hashCode());
        

        ArrayDeque r=new ArrayDeque<Integer>();
        r.add(1);
        r.add(2);
        r.add(3);
        System.out.println("dequeue");
        System.out.println(r.clone());
        System.out.println(r);
    }
}
