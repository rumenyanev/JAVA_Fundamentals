package dataTypesAndVariables_Exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PokeMon10Three {
    public static void main(String[] args) throws IOException {// in judge 80/100 ?!?!
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

 /*Input
5
2
3

Output
1
2

Comments
N = 5, M = 2, Y = 3.
We start subtracting M from N.
N - M = 3. 1 target poked.
N - M = 1. 2 targets poked.
N < M.
We print what has remained of N, which is 1.
We print the count of targets, which is 2.

Input
10
5
2

Output
2
1

Comments
N = 10, M = 5, Y = 2.
We start subtracting M from N.
N - M = 5. (N is still not less than M, they are equal).
N became EXACTLY 50 % of its original value.
5 is 50 % from 10. So we divide N by Y.
N / Y = 5 / 2 = 2. (INTEGER DIVISION).

*/
