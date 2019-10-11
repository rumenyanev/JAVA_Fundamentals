package basicSyntaxConditionalStatementsAndLoops_Exercise;

import java.util.Scanner;

public class Login05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String username = scanner.nextLine();

        StringBuilder sb = new StringBuilder();
        for (int i = username.length()-1 ; i >= 0; i--) {
            sb.append(username.charAt(i));
        }
       String password = sb.toString();

        int count = 0;

        String inputPassword = scanner.nextLine();
        while (!inputPassword.equals(password)) {
            count++;
            System.out.println("Incorrect password. Try again.");
            inputPassword = scanner.nextLine();
            if (count == 3) {
                break;
            }
        }
        if (inputPassword.equals(password)) {
            System.out.printf("User %s logged in.",username);
        } else {
            System.out.printf("User %s blocked!",username);
        }
    }
}
/*Login
You will be given a string representing a username. The password will be that username reversed. Until you receive the correct password print on the console "Incorrect password. Try again.". When you receive the correct password print "User {username} logged in." However on the fourth try if the password is still not correct print "User {username} blocked!" and end the program.
Examples
Input
Acer
login
go
let me in
recA

Output
Incorrect password. Try again.
Incorrect password. Try again.
Incorrect password. Try again.
User Acer logged in.

Input
momo
omom

Output
User momo logged in.

Input
sunny
rainy
cloudy
sunny
not sunny

Output
Incorrect password. Try again.
Incorrect password. Try again.
Incorrect password. Try again.
User sunny blocked!
*/