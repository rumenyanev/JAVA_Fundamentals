package methodsLab;

import java.util.Scanner;

public class RepeatString07Two {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();
        int count = Integer.parseInt(scanner.nextLine());
        scanner.close();
        System.out.println(repeatString(word,count));
    }
    static String repeatString(String word,int count){
        String result = "";
        for (int i = 0; i <count ; i++) {
            result += word;
        }
        return result;
    }
}