package arrays_MoreExercise;

import java.util.Scanner;

public class FibonacciSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        int f0 = 1;
        int f1 = 1;
        for (int i = 0; i < num; i++) {
            int fTemp = f0;
            f0 = f1;
            f1 = fTemp + (f0);


            System.out.println(f1);

        }

    }
}
