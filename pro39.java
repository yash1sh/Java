import java.util.Set;
import java.util.TreeSet;

public class pro39 {
    String name;
    String color;
    double price;
    pro39()
    {

    }
    pro39(String name)
    {
        this.name=name;
    }
    pro39(String name,String color)
    {
        this(name);
        this.color=color;
    }
    pro39(String name,String color,double price)
    {
        this(name,color);
        this.price=price;
    }
    public void details()
    {
        System.out.println(name);
        System.out.println(color);
        System.out.println(price);
    }
    public static void main(String[] args) {
        pro39 p= new pro39("yash","red",5.999);
        Set<String> st= new TreeSet<>();
        String[] ans= new String[]{"yash","shreyas","anil","patil","abhesh","brejesh","yash"};
        for(int i=0;i<ans.length;i++)
        {
            st.add(ans[i]);
        }
        p.details();
        System.out.println(st);
    }

}

