package methods_MoreExercise;

import java.util.Scanner;

public class LongerLine03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Point point1 = new Point(Integer.parseInt(scanner.nextLine()),
                Integer.parseInt(scanner.nextLine()));
        Point point2 = new Point(Integer.parseInt(scanner.nextLine()),
                Integer.parseInt(scanner.nextLine()));
        Line line = new Line(point1, point2);
        Point point3 = new Point(Integer.parseInt(scanner.nextLine()),
                Integer.parseInt(scanner.nextLine()));
        Point point4 = new Point(Integer.parseInt(scanner.nextLine()),
                Integer.parseInt(scanner.nextLine()));
        Line line2 = new Line(point3, point4);

        double line1distanceFromCenter = line.calculateLength();
        double line2distanceFromCenter = line2.calculateLength();

        if (line2distanceFromCenter > line1distanceFromCenter) {
            System.out.println(line2);
        } else {
            System.out.println(line);
        }
    }
}

class Point {
    private double coordX;
    private double coordY;

    public Point(double coordX, double coordY) {
        this.coordX = coordX;
        this.coordY = coordY;
    }

    public double getCoordX() {
        return coordX;
    }

    public void setCoordX(double coordX) {
        this.coordX = coordX;
    }

    public double getCoordY() {
        return coordY;
    }

    public void setCoordY(double coordY) {
        this.coordY = coordY;
    }

    @Override
    public String toString() {
        return String.format("(%.0f, %.0f)", this.getCoordX(), this.getCoordY()).trim();
    }
}

class Line {
    private Point a;
    private Point b;

    public Line(Point a, Point b) {
        this.a = a;
        this.b = b;
    }

    public Point getA() {
        return a;
    }

    public void setA(Point a) {
        this.a = a;
    }

    public Point getB() {
        return b;
    }

    public void setB(Point b) {
        this.b = b;
    }

    public double calculateLength() {
        return Math.sqrt(Math.pow(b.getCoordX() - a.getCoordX(), 2)
                + Math.pow(b.getCoordY() - a.getCoordY(), 2));
    }

    @Override
    public String toString() {

        double sumLinePoint1 = Math.abs(a.getCoordX()) + Math.abs(a.getCoordY());
        double sumLinePoint2 = Math.abs(b.getCoordX()) + Math.abs(b.getCoordY());

        if (sumLinePoint1 < sumLinePoint2) {
            return String.format("%s%s", a.toString(), b.toString()).trim();
        } else {
            return String.format("%s%s", b.toString(), a.toString()).trim();
        }
    }
}

/*Longer Line
You are given the coordinates of four points in the 2D plane.
The first and the second pair of points form two different lines. Print the longer line in format "(X1, Y1)(X2, Y2)"
 starting with the point that is closer to the center of the coordinate system (0, 0) (You can reuse the method that you wrote for the previous problem).
  If the lines are of equal length, print only the first one.
Examples
Input
2
4
-1
2
-5
-5
4
-3

Output
(4, -3)(-5, -5)
*/