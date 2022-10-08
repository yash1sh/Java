

public class myntra extends Shopping{
    
        myntra(int belt,int shoes,int dress)
        {
            //Super key word used to access superclass constructor.
            super(belt, shoes, dress);
        }
        public void getresult()
        {
            System.out.println("Belt price "+belt+"\nDress price "+dress+"\nShoes price "+shoes);
        }
    
}
