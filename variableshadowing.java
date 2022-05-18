
class al
{
    int a=20;
    public  void m1()
    {
        System.out.println("Hello sir j");
    }

    public   void m2()
    {
        System.out.println("Hello m2 j");
    }

    public  void m3()
    {
        System.out.println("Hello m3 j");
    }

    public  void m4()
    {
        System.out.println("Hello m4 j");
    }

    public  void m5()
    {
        System.out.println("Hello m5 j");
    }

}

class b extends al
{
    int a=121;
    static int b=232;

    public  void m1()
    {
        System.out.println("Hello mm1 j");
    }

    public  void m2()
    {
        System.out.println("Hello mm2 j");
    }

    public  void m3()
    {
        System.out.println("Hello mmm3 j");
    }

    public  void m4()
    {
        System.out.println("Hello mm4 j");
    }

    public  void m5()
    {
        System.out.println("Hello mm5 j");
    }
}


public class variableshadowing {
    public static void main(String[] args) {
        al x=new b();
        System.out.println(x.a);
        x.m1();
        x.m2();
        x.m3();
        x.m4();
        x.m5();
        
        b y=(b)x;
        
        y.m1();
        y.m2();
        y.m3();
        y.m4();
        y.m5();
        
    }
}
