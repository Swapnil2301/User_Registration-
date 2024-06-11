import java.util.regex.*;
import java.util.Scanner;
public class UserRegistration {
    public static void FirstName(String name){
        Pattern pattern = Pattern.compile("[A-Z][a-z]{3,}");
        Matcher matcher = pattern.matcher(name);
        boolean ismatch= matcher.matches();
        if(ismatch){
            System.out.println("Valid input");
        }
        else{
            System.out.println("Invalid Input");
        }
    }

    public static void LastName(String name){
        Pattern pattern = Pattern.compile("[A-Z][a-z]{3,}");
        Matcher matcher = pattern.matcher(name);
        boolean ismatch= matcher.matches();
        if(ismatch){
            System.out.println("Valid input");
        }
        else{
            System.out.println("Invalid Input");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First  Name");
        String name =sc.nextLine();
        System.out.println("Enter Last  Name");
        String name1 =sc.nextLine();
        FirstName(name);
        LastName(name1);
    }
}