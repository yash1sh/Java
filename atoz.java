public class atoz {
    public static void printit(char a)
    {
        if(a>'z')
        return;

        System.out.print(a+" ");
        printit((char)((int)a+1));
    }
    public static void main(String[] args) {
        printit('a');
    }
}
