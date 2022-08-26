import java.util.Scanner;

public class cal {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the following input 1)addition 2)sub 3)mul 4) div");
        int a,b,ch=sc.nextInt();
        switch(ch)
        {
            case 1:System.out.println("Enter the 2 values to add");
            a=sc.nextInt();
            b=sc.nextInt();
            System.out.println("Addition is "+(a+b));
            break;
            case 2:System.out.println("Enter the 2 values to subtract");
            a=sc.nextInt();
            b=sc.nextInt();
            System.out.println("Addition is "+ (a-b));
            break;
            case 3:System.out.println("Enter the 2 values to mul");
            a=sc.nextInt();
            b=sc.nextInt();
            System.out.println("Addition is "+a*b);
            break;
            case 4:System.out.println("Enter the 2 values to div");
            a=sc.nextInt();
            b=sc.nextInt();
            System.out.println("Addition is "+a/b);
            break;
        }
        sc.close();
    }
}
