public class pro50collegeDriver {
    public static void main(String[] args) {
        pro50college p=new pro50college("ankjnas","lekjndsd");
        pro50college p1=p;
        pro50college p2=p1;
        System.out.println(p2.name);
        System.out.println(p1.name);
        System.out.println(p.name);
    }

}
