package examsFundamentals.programmingFundamentalsFinalExam_07December2019Group_1;

import java.util.Scanner;

public class EmailValidator01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String email = scanner.nextLine();

        String[] line = scanner.nextLine().split("\\s+");
        int index;

        while (!"Complete".equals(line[0])) {

            switch (line[0]) {
                case "Make":
                    if ("Upper".equals(line[1])) {
                        System.out.println(toUpper(email));
                        email = email.toUpperCase();
                        break;
                    } else if ("Lower".equals(line[1])) {
                        System.out.println(toLower(email));
                        email = email.toLowerCase();
                        break;
                    }
                case "GetDomain":
                    index = Integer.parseInt(line[1]);
                    System.out.println(getDomain(email, index));

                    break;
                case "GetUsername":
                    checkEmail(email);
                    System.out.println(getUsername(email));
                    break;
                case "Replace":
                    String s = line[1];
                    email = email.toLowerCase();
                    System.out.println(replace(email,s));
                    break;
                case "Encrypt":
                    System.out.println(encrypt(email));
                    break;

            }
            line = scanner.nextLine().split("\\s+");
        }
    }
    private static void checkEmail(String email) {
        if (!email.contains("@")) {
            System.out.printf("The email %s doesn't contain the @ symbol.", email);
        }
    }
    private static String replace(String email,String c) {
        return email.replaceAll( c,"-");
    }
    private static String encrypt(String email) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < email.length(); i++) {
            sb.append((int) (email.charAt(i))).append(" ");
        }
        return sb.toString();
    }
    private static String getUsername(String email) {
        int index = email.indexOf("@");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < index; i++) {
            sb.append(email.charAt(i));
        }
        return sb.toString();
    }

    private static String getDomain(String email, int numSymbols) {
        StringBuilder sb = new StringBuilder();
        for (int i = email.length()-1; i >= email.length() - numSymbols; i--) {
            sb.append(email.charAt(i));
        }
        sb.reverse();
        return sb.toString();
    }

    private static String toUpper(String email) {
        return email.toUpperCase();
    }

    private static String toLower(String email) {
        return email.toLowerCase();

    }
}


/*Email Validator
Your friend has hired you to help him with his website creation. Your current task is to create an Email Validator.
Create a program that manipulates a string and makes it suitable for an Email.
First, you are going to receive the email that the user wants to use, then you will receive commands.
You will be receiving commands until the "Complete" command. There are six possible commands:

"Make Upper"
Replace all letters with upper case, then print the result.

"Make Lower"
Replace all letters with lower case, then print the result.

"GetDomain {count}
Print the last {count} characters of the Email.

"GetUsername"
Print the substring from the start of the Email until the @ symbol.
If the Email doesn’t contain the @ symbol, print:
"The email {email} doesn't contain the @ symbol."

"Replace {char}"
Replace all occurences of the {char} with a dash "-" and print the result.

"Encrypt"
Get the ASCII value of each symbol. Print the result on a single line separated by a single space

Input
On the 1st line you are going to receive the Email in the form of a string.
On the next lines, until the "Complete" command is received, you will be receiving commands.
Output
Print the output of every command in the format described above.
Examples

Input
Mike123@somemail.com
Make Upper
GetDomain 3
GetUsername
Encrypt
Complete


Output
MIKE123@SOMEMAIL.COM
COM
MIKE123
77 73 75 69 49 50 51 64 83 79 77 69 77 65 73 76 46 67 79 77


Input
AnotherMail.com
Make Lower
GetUsername
Replace a
Complete


Output
anothermail.com
The email anothermail.com doesn't contain the @ symbol.
-notherm-il.com

*/
