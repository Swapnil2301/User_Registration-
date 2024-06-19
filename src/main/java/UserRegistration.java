import java.util.regex.*;
import java.util.Scanner;
public class UserRegistration {
    public static Boolean FirstName(String name){
        Pattern pattern = Pattern.compile("[A-Z][a-z]{3,}");
        Matcher matcher = pattern.matcher(name);
        boolean ismatch= matcher.matches();
        if(ismatch){
            return true;
        }
        else{
          return false;
        }
    }
    public static Boolean LastName(String name){
        Pattern pattern = Pattern.compile("[A-Z][a-z]{3,}");
        Matcher matcher = pattern.matcher(name);
        boolean ismatch= matcher.matches();
        if(ismatch){
            return true;
        }
        else{
            return false;
        }
    }
    public static boolean emailId(String name ){
        Pattern pattern=Pattern.compile("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$");
        Matcher match= pattern.matcher(name);
        boolean ismatch= match.matches();
        if(ismatch){
            return true;
        }else {
            return false;
        }

    }
    public static boolean phNumber(String name ){
        Pattern pattern=Pattern.compile("^\\+[0-9]{0,2}\\s[1-9][0-9]{9}$");
        Matcher match= pattern.matcher(name);
        boolean ismatch= match.matches();
        if(ismatch){
            return true;
        }else {
            return false;
        }
    }
    public static boolean Password(String text){
        Pattern pattern = Pattern.compile("^(?=.*[A-Z]{1,})(?=.*[0-9]{1,}).*[a-z](?=.*[!@#$%&]{1})(.{7,})$");
        Matcher match = pattern.matcher(text);
        boolean ismatch =match.matches();
        if(ismatch){
            return true;
        }else {
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First Name:");
        String name = sc.nextLine();
        if (FirstName(name)) {
            System.out.println("First Name is valid");
        } else {
            System.out.println("First Name is invalid");
        }

        System.out.println("Enter Last Name:");
        String lastname = sc.nextLine();
        if (LastName(lastname)) {
            System.out.println("Last Name is valid");
        } else {
            System.out.println("Last Name is invalid");
        }

        System.out.println("Enter Phone Number (e.g., +91 8104345244):");
        String number = sc.nextLine();
        if (phNumber(number)) {
            System.out.println("Phone Number is valid");
        } else {
            System.out.println("Phone Number is invalid");
        }

        System.out.println("Enter Email ID:");
        String email = sc.nextLine();
        if (emailId(email)) {
            System.out.println("Email ID is valid");
        } else {
            System.out.println("Email ID is invalid");
        }

        System.out.println("Enter Password: (Minimun One Uppercase,One Number,One Symbol and Minimum 8 Char)");
        String password = sc.nextLine();
        if (Password(password)) {
            System.out.println("Password is valid");
        } else {
            System.out.println("Password is invalid");
        }
    }
}