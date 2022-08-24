import java.util.Scanner;
import java.util.regex.Pattern;

public class checkStrinhNumberSpecial {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Pattern num=  Pattern.compile("^[0-9]*");
        Pattern charss= Pattern.compile("^[a-zA-Z]*");
        Pattern special= Pattern.compile("^[@# \\$ \\^\\&\\*]*");
        System.out.println("Enter the String");
        String str=sc.nextLine();
        if(num.matcher(str).matches())
        System.out.println("Is a number");
        else if(charss.matcher(str).matches())
        System.out.println("IS a character");
        else if(special.matcher(str).matches())
        System.out.println("IS a special Character");
        sc.close();
    }
}
