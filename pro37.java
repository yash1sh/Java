
public class pro37 {
    String color="2222";
    String price="2222";
    static int d=20;
    static{
        System.out.println(d);
    }
    pro37(int d)
    {
       pro37.d=d;
    }
    {
        System.out.println("you can send a msg");
    }
    public void details()
    {
        System.out.println(color);
        System.out.println(price);
    }
    public static void main(String[] args) {

        pro37 m= new pro37(40);
        System.out.println(d);
        m.details();

    }
}
