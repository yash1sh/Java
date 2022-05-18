


import java.util.Scanner;
class ball
{
    double radius;

    ball(Double radius)
    {
        this.radius = radius;
    }
}
class basket_ball extends ball
{
    basket_ball(double radius)
    {
        super(radius);
    }

    public void getradius()
    {
        System.out.println(radius);
    }
}



class tenisball extends  ball
{
    tenisball(double radius)
    {
        super(radius);
    }
    public void getradius()
    {
        System.out.println(radius);
    }
}

 class bag
{
    ball b;
    public void addball()
    {
        Scanner sc=new Scanner(System.in);
            System.out.println("enter the game you wnnna play?");
            System.out.println("1)basketball or 2)tenisball");
            int ch=sc.nextInt();
            if(ch==1)
            {
                this.b=new basket_ball(10.0);
                System.out.println("Basket ball added");
            }
            else
            {
                this.b=new tenisball(5.0);
                System.out.println("tenis ball added");
            }
    }

    public void isempty()
    {

        if(this.b==null)
            System.out.println("bag is empty");
        else
            System.out.println("Bag is not empty");


    }

    public void removeball()
    {
        if(b instanceof basket_ball)
        {
            this.b=null;
            System.out.println("Basket Ball removed");
        }
        else
        {
            this.b=null;
            System.out.println("Tenis bll removed");
        }

    }

    public void getradius()
    {
        if(this.b instanceof basket_ball)
        {
            basket_ball x=(basket_ball)b;
            x.getradius();
        }
        else
        {
    
            tenisball x=(tenisball)b;
            x.getradius();
        }   
    }

}

public class balldriver {
    public static void main(String[] args) {
        boolean e=true;
        Scanner sc=new Scanner(System.in);
        bag bag=new bag();
        while(e)
        {
            System.out.println("Enter the choice");
            System.out.println("1)Add ball\n2)Is ball emoty\n3)remove ball\n4)Get radius\n5)exit");
            int ch=sc.nextInt();
            switch(ch)
            {
                case 1:
                    bag.addball();
                    break;
                case 2:
                    bag.isempty();
                    break;
                case 3:
                    bag.removeball();
                    break;
                case 4:
                    bag.getradius();
                    break;
                case 5:
                    e=false;
                    break;
                default:
                    System.out.println("Invalid input");
                    
                
            }
        }
    }
}
