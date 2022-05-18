
import java.util.Scanner;
class google {

    Shopping s;

    public void addorder()
    {
        if(this.s==null)
        {
            boolean e=true;
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter your choice");
            System.out.println("1)flipkart\n2)amazon\n3)myntra");
            int ch=sc.nextInt();
            if(ch==1)
            {
                s=new flipkart(100, 5000, 1100);
                System.out.println("order placed in flipkart");
            }
            else if(ch==2)
            {
                s=new amazon(50, 10000, 12010);
                System.out.println("Order placed in amazon");
            }
            else
            {
                s=new myntra(111, 1212, 12121);
                System.out.println("order placed in myntra");
            }
        }
        else if(s!=null)
            System.out.println("order placed");
        

    }
    public void showshopdetails()
    {
        if(s!=null)
        {
            if(s instanceof amazon)
            {
                amazon x=(amazon)s;
                x.getresult();
            }
            else if(s instanceof flipkart)
            {
                flipkart x=(flipkart)s;
                x.getresult();
            }
            else if(s instanceof myntra)
            {
                myntra x=(myntra)s;
                x.getresult();
            }

        }
        else
        System.out.println("No selected");
    }
    public void cancel()
    {
        if(s instanceof flipkart)
        {
            this.s=null;
            System.out.println("Flipkart oeder deleted");
        }
        else if(s instanceof myntra)
        {
            this.s=null;
            System.out.println("Myntra order deleted");
        }
        else if(s instanceof amazon)
        {
            this.s=null;
            System.out.println("mazon order deeleted");
        }
    }

}
