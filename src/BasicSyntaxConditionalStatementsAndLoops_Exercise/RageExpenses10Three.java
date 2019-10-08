package BasicSyntaxConditionalStatementsAndLoops_Exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@SuppressWarnings("Duplicates")
public class RageExpenses10Three {

        @SuppressWarnings("Duplicates")
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int countLostGames = Integer.parseInt(scanner.nextLine());
            double headsetPrice = Double.parseDouble(scanner.nextLine());
            double mousePrice = Double.parseDouble(scanner.nextLine());
            double keyboardPrice = Double.parseDouble(scanner.nextLine());
            double displayPrice = Double.parseDouble(scanner.nextLine());

            List<Double> gameSet = new ArrayList<>();
            double setPrice;
            for (int i = 1; i < countLostGames+1; i++) {

                if (i % 12 == 0) {
                    gameSet.add(displayPrice);
                }
                if ( i % 6 == 0) {
                    gameSet.add(keyboardPrice);
                }
                if (i % 3 == 0) {
                    gameSet.add(mousePrice);
                }
                if (i % 2 == 0) {
                    gameSet.add(headsetPrice);
                }
            }
            setPrice = gameSet.stream().reduce(0.0,(a,b)->a+b);


            System.out.printf("Rage expenses: %.2f lv.",setPrice);
        }
}

