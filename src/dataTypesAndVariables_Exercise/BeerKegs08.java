package dataTypesAndVariables_Exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class BeerKegs08 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader
                (new InputStreamReader(System.in));

        int numKegs = Integer.parseInt(reader.readLine());
        double radius = 0.0;
        int height = 0;

        List<BeerKegs> beerKegs = new ArrayList<>();

        for (int i = 0; i < numKegs; i++) {
            String nameKegs = reader.readLine();
            radius = Double.parseDouble(reader.readLine());
            height = Integer.parseInt(reader.readLine());
            beerKegs.add(new BeerKegs(nameKegs, radius, height));
        }

        //BeerKegs max = beerKegs.stream().max((e1, e2) -> Double.compare(e1.getVolume(), e2.getVolume())).orElse(null);
        //BeerKegs max = beerKegs.stream().max(Comparator.comparingDouble(BeerKegs::getVolume)).orElse(null);
        beerKegs.stream().max(Comparator.comparingDouble(BeerKegs::getVolume)).ifPresent(max -> System.out.println(max.getNameKegs()));

    }
}

class BeerKegs {
    private String nameKegs;
    private double radius;
    private int height;
    private double volume;

    public BeerKegs(String nameKegs, double radius, int height) {
        this.nameKegs = nameKegs;
        this.radius = radius;
        this.height = height;
        setVolume();
    }

    public void setVolume() {
        this.volume = Math.PI * (Math.pow(radius, 2)) * height;
    }

    public String getNameKegs() {
        return nameKegs;
    }

    public double getRadius() {
        return radius;
    }

    public int getHeight() {
        return height;
    }

    public double getVolume() {
        return volume;
    }

}
/*⦁	Beer Kegs
Write a program, which calculates the volume of n beer kegs.
You will receive in total 3 * n lines. Each three lines will hold information for a single keg.
First up is the model of the keg, after that is the radius of the keg, and lastly is the height of the keg.
Calculate the volume using the following formula: π * r^2 * h.
At the end, print the model of the biggest keg.
Input
You will receive 3 * n lines. Each group of lines will be on a new line:
⦁	First – model – string.
⦁	Second –radius – floating-point number
⦁	Third – height – integer number
Output
Print the model of the biggest keg.
Constraints
⦁	n will be in the interval [1…10]
⦁	The radius will be a floating-point number in the interval [1…3.402823E+38]
⦁	The height will be an integer in the interval [1…2147483647]
Examples
Input			Input	Output
3
Keg 1
10
10
Keg 2
20
20
Keg 3
10
30

Output
Keg 2

Input
2
Smaller Keg
2.41
10
Bigger Keg
5.12
20

Output
Bigger Keg
                      */