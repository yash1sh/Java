class Student
{
    String name="yash";
    int id=2323;
    char gender='m';

    
    public String toString()
    {
       return " Name is "+name+"\nId is "+id+"\nGender is "+gender;
    }
}

public class object_class {
    public static void main(String[] args) {
        
    Student sc=new Student();
    System.out.println(sc);
    }
}
