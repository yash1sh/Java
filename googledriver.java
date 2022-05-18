import java.util.Scanner;

public class googledriver {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        google g=new google();
        boolean e=true;
        int ch;
        while(e)
        {
            System.out.println("enter your choice");
            System.out.println("1) add order \n2) show order \n3)cancel \n4)exit");
            ch=sc.nextInt();
            switch(ch)
            {
                case 1:
                    g.addorder();
                    break;
                case 2:
                    g.showshopdetails();
                    break;
                case 3:
                    g.cancel();
                    break;
                case 4:
                    e=false;
                    break;
                default:
                    System.out.println("Invalid input");
            }
        }
    }
}
