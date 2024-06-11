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
    public static void emailId(String name ){
        Pattern pattern=Pattern.compile("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$");
        Matcher match= pattern.matcher(name);
        boolean ismatch= match.matches();
        if(ismatch){
            System.out.println("Valid input");
        }else {
            System.out.println("Inavaid input");
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
        System.out.println("Enter First Name");
        String name =sc.nextLine();
        System.out.println("Enter Last Name");
        String lastname =sc.nextLine();
        System.out.println("Enter Email:");
        String email =sc.nextLine();
        //FirstName(name);
        //LastName(lastname);
        emailId(email);
    }
}