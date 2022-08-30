public class pro47child extends pro47father {
    // int dd=30;
    
    static void m1(){
        System.out.println("Now changed in chid");
    }
    public static void main(String[] args) {
        System.out.println(d);
        pro47child p=new pro47child();
        System.out.println(p.dd);
       pro47father.m1();
       m1();
        
    }
}
