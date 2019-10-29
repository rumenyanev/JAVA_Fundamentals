package methods_Exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PalindromeInteger09Tree {



        public static void main(String[] args) throws IOException {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            boolean status = false;

            String strNumbers = reader.readLine();
            while (!strNumbers.equals("END")) {

                status = isPalindrome(strNumbers);
                System.out.println(status);

                strNumbers = reader.readLine();
            }
        }


        static boolean isPalindrome(String input){
            boolean result = false;
            if (input.length() == 1){
                result = true;
            }
            for (int i = 0; i < input.length()/2; i++) {
                if (input.charAt(i) == input.charAt(input.length()-1)) {
                    result = true;
                }
            }
            return result;
        }
    }

