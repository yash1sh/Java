public class king {
    static int a=20;
    static{
        System.out.println("hello");
        king.a=40;
        System.out.println(a);
    }
    public static void main(String[] args) {
        System.out.println(a);
    }

}
