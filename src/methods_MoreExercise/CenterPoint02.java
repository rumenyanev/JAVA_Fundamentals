package methods_MoreExercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CenterPoint02 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader
                (new InputStreamReader(System.in));
        int x1 = Integer.parseInt(reader.readLine());
        int y1 = Integer.parseInt(reader.readLine());
        int x2 = Integer.parseInt(reader.readLine());
        int y2 = Integer.parseInt(reader.readLine());

        centerPoint(x1,y1,x2,y2);

    }
    static void centerPoint(int a,int b,int c,int d){

        int x = a + b;
        int y = c + d;
        if(x > y ){
            System.out.printf("(%d, %d)",c,d);
        }else if (x == y){
            System.out.printf("(%d, %d)",a,b);
        }else {
            System.out.printf("(%d, %d)",a,b);
        }
    }
}
/*Center Point
You are given the coordinates of two points on a Cartesian coordinate system - X1, Y1, X2 and Y2.
Create a method that prints the point that is closest to the center of the coordinate system (0, 0)
in the format (X, Y). If the points are on a same distance from the center, print only the first one.
Examples
Input
2
4
-1
2


Output
(-1, 2)
                */