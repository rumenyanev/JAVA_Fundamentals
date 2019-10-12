package dataTypesAndVariables_Exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PokeMon10Three {
    public static void main(String[] args) throws IOException {///80/100 ?
        BufferedReader reader = new BufferedReader
                (new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());
        int m = Integer.parseInt(reader.readLine());
        int y = Integer.parseInt(reader.readLine());

        int count = 0;
        int n1 = n;
        if (n <= 0) {
            return;
        }
        while (n1 >= m) {
            n1 -= m;
            count++;
            if (n == (m * 2)) {
                n1 /= y;
            }

        }

        System.out.println(n1);
        System.out.println(count);
    }
}
