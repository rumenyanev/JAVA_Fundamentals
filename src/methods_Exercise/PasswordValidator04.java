package methods_Exercise;

import java.util.Scanner;

public class PasswordValidator04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String password = scanner.nextLine();

        scanner.close();

        if(!charOfPassword(password)){
            System.out.println("Password must be between 6 and 10 characters");
        }
        if (!letterAndDigits(password)){
            System.out.println("Password must consist only of letters and digits");
        }
        if(!haveAtListTwoDigit(password)){
            System.out.println("Password must have at least 2 digits");
        }
        if(charOfPassword(password) && letterAndDigits(password) && haveAtListTwoDigit(password)){
            System.out.println(" Password is valid");
        }
    }
    private static boolean haveAtListTwoDigit(String password){
        int count = 0;
        for (int i = 0; i < password.length(); i++) {
            if (Character.isDigit(password.charAt(i))) {
                count++;
            }
        }
        if(count < 2){
            return  false;
        }
        return true;
    }
    private static boolean letterAndDigits(String password) {

        for (int i = 0; i < password.length(); i++) {
            if(!Character.isLetterOrDigit(password.charAt(i))){
                return false;
            }
        }
        return true;
    }

    private static boolean charOfPassword(String password) {
        if (password.length() >= 6 && password.length() <= 10) {
            return true;
        }
        return false;
    }
}
/*Password Validator
Write a program that checks if a given password is valid.

Password rules are:
6 – 10 characters (inclusive)
Consists only of letters and digits
Have at least 2 digits


If a password is valid print “Password is valid”.
If it is not valid, for every unfulfilled rule print a message:

"Password must be between 6 and 10 characters"
"Password must consist only of letters and digits"
"Password must have at least 2 digits"
Examples

Input
logIn

Output
Password must be between 6 and 10 characters
Password must have at least 2 digits

Input
MyPass123

Output
Password is valid

Input
Pa$s$s

Output
Password must consist only of letters and digits
Password must have at least 2 digits


Hints
Write a method for each rule.
*/