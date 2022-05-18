
import java.io.*;
import java.util.*;


public class abdriver {




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

    public static void main(String [] args) throws InterruptedException
    {
        // b b = new b();
        // a.m1();
        // a.m2();
        // a.m3();
        // a.m4();
        // b.m5();
        // b.m6();

        // System.out.println(b.a+" "+b.name);
        


        // int a=20;
        // int b=10;
        // if(a>b)
        //     throw new ArithmeticException("Manually throw");
        // else
        //     System.out.println("No exception");      
            // for(int i=0;i<5;i++)
            // {
            //     System.out.println("hello");
            //     Thread.sleep(5000);
            // }
        

        int a[]={1,2,3,4,5};
        System.out.println(" "+Arrays.toString(a));
        
        

    }
}
