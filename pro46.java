public class pro46 {
    int d=40;
    public static void main(String args[])
    {
        pro46Child c=new pro46Child();
        System.out.println(c.c);
        System.out.println(c.a);
        pro46 p= new pro46();
        System.out.println(p.d);
        pro46 p1= new pro46();
        p1.d=100;
        System.out.println(p1.d);
    }
}
