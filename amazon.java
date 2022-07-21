
public class amazon extends Shopping
{
    //constructor chaining
    amazon(int belt,int dress,int shoes)
    {
        super(belt, shoes, dress);
    }
    public void getresult()
    {
        System.out.println("Belt price "+belt+"\nDress price "+dress+"\nShoes price "+shoes);
    }
}
