package objectsAndClasses_Exercise.vehicleCatalogue06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader
                (new InputStreamReader(System.in));

        String input = "";

        List<Vehicle> vehicles = new ArrayList<>();

        while (!"End".equals(input = reader.readLine())) {
            String[] data = input.split("\\s+");
            String type = data[0];
            String model = data[1];
            String color = data[2];
            int horsepower = Integer.parseInt(data[3]);
            Vehicle vehicle = new Vehicle(type, model, color, horsepower);

            vehicles.add(vehicle);


        }
        String model = reader.readLine();

        while (!"Close the Catalogue".equals(model)) {
            String finalModel = model; // tova se pravi zashtoto StreamAPI priema stoinost kojato ne se promenja

            vehicles.stream().
                    filter(vehicle -> vehicle.getModel().
                            equals(finalModel)).
                    forEach(System.out::println);

            model = reader.readLine();
        }
        System.out.println(
                String.format("Cars have average horsepower of: %.2f.",
                        average(vehicles.stream().
                                filter(vehicle -> vehicle.getType().
                                        equals("car")).collect(Collectors.toList()))));

        System.out.println(
                String.format("Trucks have average horsepower of: %.2f.",
                        average(vehicles.stream().
                                filter(vehicle -> vehicle.getType().
                                        equals("truck")).collect(Collectors.toList()))));
    }

    private static double average(List<Vehicle> vehicles) {
        if (vehicles.size()== 0){
            return 0.0;
        }
        double sum = 0;

        for (Vehicle vehicle : vehicles) {
            sum += vehicle.getHorsepower();
        }
        return sum/vehicles.size();
    }
}

/*Vehicle Catalogue
You have to make a catalogue for vehicles. You will receive two types of vehicle – car or truck.
Until you receive the command “End” you will receive lines of input in the format:
{typeOfVehicle} {model} {color} {horsepower}
After the “End” command, you will start receiving models of vehicles. Print for every received vehicle its data in the format:
Type: {typeOfVehicle}
Model: {modelOfVehicle}
Color: {colorOfVehicle}
Horsepower: {horsepowerOfVehicle}

When you receive the command "Close the Catalogue", stop receiving input and print the average horsepower for the cars and for the trucks in the format:
"{typeOfVehicles} have average horsepower of {averageHorsepower}."
The average horsepower is calculated by dividing the sum of horsepower for all vehicles of the type by the total count of vehicles from the same type.
Format the answer to the 2nd decimal point.
Constraints
The type of vehicle will always be car or truck.
You will not receive the same model twice.
The received horsepower will be integer in the interval [1…1000]
You will receive at most 50 vehicles.
Single whitespace will be used for separator.

Examples

Input
truck Man red 200
truck Mercedes blue 300
car Ford green 120
car Ferrari red 550
car Lamborghini orange 570
End
Ferrari
Ford
Man
Close the Catalogue


Output
Type: Car
Model: Ferrari
Color: red
Horsepower: 550
Type: Car
Model: Ford
Color: green
Horsepower: 120
Type: Truck
Model: Man
Color: red
Horsepower: 200
Cars have average horsepower of: 413.33.
Trucks have average horsepower of: 250.00.
*/