class parent
{
    int a=10;
    public void m1() {
        System.out.println("hello sir");
    }
}

class child extends parent
{
    int b=20;
    public void m2()
    {
        System.out.println("Vaibhav winner");
    }
}
public class p_c_driver {
    public static void main(String[] args) {
        child c= new child();
        System.out.println("Parent variable is "+c.a+"Child Variable "+c.b);
        System.out.println("Parent and child methods");
        c.m2();
        c.m1();
        System.out.println("Using upcast");
        parent p=new child();
        p.m1();
        System.out.println(p.a);
        System.out.println("Cannot use Child attributes in parent so using downcast");
        child a=(child)p;
        System.out.println(a.a+" "+a.b);
        a.m1();
        a.m2();
        System.out.println("All available now");
    }
}
