package methods_Exercise;

import java.util.Scanner;

public class NxN_Matrix07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int[][] matrix = new int[number][number];
        matrixNxN(number, matrix);
        printMatrix(matrix);
        scanner.close();
    }

    private static void matrixNxN(int n, int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                matrix[row][col] = n;
            }
        }
    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
/*NxN Matrix
Write a method that receives a single integer n and prints nxn matrix with that number.
Examples
Input
3

Output
3 3 3
3 3 3
3 3 3

Input
7

Output
7 7 7 7 7 7 7
7 7 7 7 7 7 7
7 7 7 7 7 7 7
7 7 7 7 7 7 7
7 7 7 7 7 7 7
7 7 7 7 7 7 7
7 7 7 7 7 7 7


Input
2

Output
2 2
2 2
                   */