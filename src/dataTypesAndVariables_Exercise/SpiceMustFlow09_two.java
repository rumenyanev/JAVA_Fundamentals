package dataTypesAndVariables_Exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class SpiceMustFlow09_two {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int spices = Integer.parseInt(reader.readLine());
        int sumSpices = 0;
        int days = 0;

        if (spices < 100) {
            System.out.println(days);
            System.out.println(sumSpices);
            return;
        }

        while (true) {
            if (spices >= 100) {
                sumSpices += spices;
                sumSpices -= 26;
                days++;
                spices -= 10;
            } else {
                sumSpices -= 26;
                System.out.println(days);
                System.out.println(sumSpices);
                break;
            }
        }
    }
}