public class pro42laptop {
    String name;
    String color;
    int prize;
    pro42motherb p;
    pro42laptop(String name,String color,int prize,pro42motherb p)
    {
        this.name=name;
        this.color=color;
        this.prize=prize;
        this.p=p;
    }
    void display()
    {
        System.out.println(name+" "+color+" "+prize+" "+p.brand);
    }
}
