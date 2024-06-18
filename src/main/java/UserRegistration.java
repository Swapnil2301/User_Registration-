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
            System.out.println("Valid Last Name");
        }
        else{
            System.out.println("Invalid Last Name");
        }
    }
    public static void emailId(String name ){
        Pattern pattern=Pattern.compile("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$");
        Matcher match= pattern.matcher(name);
        boolean ismatch= match.matches();
        if(ismatch){
            System.out.println("Valid Email");
        }else {
            System.out.println("Inavaid Email");
        }

    }
    public static void phNumber(String name ){
        Pattern pattern=Pattern.compile("^\\+[0-9]{0,2}\\s[1-9][0-9]{9}$");
        Matcher match= pattern.matcher(name);
        boolean ismatch= match.matches();
        if(ismatch){
            System.out.println("Valid Number");
        }else {
            System.out.println("Inavaid Number");
        }
    }
    public static void Password(String text){
        Pattern pattern = Pattern.compile("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)[a-zA-Z\\d]{8,}$");
        Matcher match = pattern.matcher(text);
        boolean ismatch =match.matches();
        if(ismatch){
            System.out.println("Valid Password");
        }
        else{
            System.out.println("Invalid Password");
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
        FirstName(name);
        LastName(lastname);
        emailId(email);
        System.out.println("Enter Number: ");
        String number= sc.nextLine();
        phNumber(number);
        System.out.println("Enter Password");
        String password ="swapnilY1";
        Password(password);
    }
}