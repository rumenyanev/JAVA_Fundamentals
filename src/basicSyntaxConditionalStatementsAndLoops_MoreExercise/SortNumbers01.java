package basicSyntaxConditionalStatementsAndLoops_MoreExercise;

import java.util.Scanner;

public class SortNumbers01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());
       sort(a,b,c);


    }
    static void sort(int a, int b, int c) {
           int min = a;
           int mid = b;
           int max = c;
            if (min > mid) { mid = a; min = b; }
            if (mid > max)
            {
                max = mid;
                mid = c;
                if (min > mid)
                {
                    mid = min;
                    min = c;
                }
            }
        System.out.println(max);
        System.out.println(mid);
        System.out.println(min);
        }
    }

/*Sort Numbers
 Read three real numbers and sort them in descending order. Print each number on a new line.
Examples
Input
2
1
3

Output
3
2
1

Input
-2
1
3

Output
3
1
-2


Input
0
0
2

Output
2
0
0
            */