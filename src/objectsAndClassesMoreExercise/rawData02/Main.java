package objectsAndClassesMoreExercise.rawData02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader
                (new InputStreamReader(System.in));

        int numOfCars = Integer.parseInt(reader.readLine());
        Map<String, Car> cars = new LinkedHashMap<>();
        Engine engine = null;
        Cargo cargo = null;
        Tire tire = null;
        List<Tire> tires = new ArrayList<>();

        while (numOfCars-- > 0) {
            String[] information = reader.readLine().split(" ");
            String model = information[0];
            int engineSpeed = Integer.parseInt(information[1]);
            int enginePower = Integer.parseInt(information[2]);
            engine = new Engine(engineSpeed, enginePower);

            String cargoWeight = information[3];
            String cargoType = information[4];
            cargo = new Cargo(cargoWeight, cargoType);


            for (int i = 5; i < information.length; i += 2) {
                double pressureValue = Double.parseDouble(information[i]);
                int age = Integer.parseInt(information[i + 1]);
                Tire t = new Tire(pressureValue, age);
                //if (tires.size() + 1 > 4) break;
                tires.add(t);
            }
            cars.putIfAbsent(model, new Car(model, engine, cargo, tires));

        }
        int a = 1;
        String typeCargo = reader.readLine();


        if (typeCargo.equals("fragile")) {
            //cars.values().stream().filter(Car::isHasTire).forEach(car-> System.out.println(car.getModel()));
            a = 1;
            for (Map.Entry<String, Car> carEntry : cars.entrySet()) {
                if (carEntry.getValue().isHasTire()) {
                    System.out.println(carEntry);
                }
            }

        } else if (typeCargo.equals("flamable")) {
            cars.values().stream().filter(Car::isHasPowerEngine).forEach(car -> System.out.println(car.getModel()));
        }

    }
}
/*
* Raw Data
You are the owner of a courier company and want to make a system for tracking your cars and their cargo.
 Define a class Car that holds information about model, engine, cargo and a collection of exactly 4 tires.
 The engine, cargo and tire should be separate classes, create a constructor that receives all information about
 the Car and creates and initializes its inner components (engine, cargo and tires).
On the first line of input you will receive a number N - the number of cars you have, on each of the next N lines you will receive
information about a car in the format
“<Model> <EngineSpeed> <EnginePower> <CargoWeight> <CargoType> <Tire1Pressure> <Tire1Age> <Tire2Pressure>
<Tire2Age> <Tire3Pressure> <Tire3Age> <Tire4Pressure> <Tire4Age>” where the speed, power, weight and tire age are integers, tire pressure is a double.
After the N lines you will receive a single line with one of 2 commands “fragile” or “flamable” , if the command is “fragile” print all cars
whose Cargo Type is “fragile” with a tire whose pressure is  < 1, if the command is “flamable” print all cars whose Cargo Type is “flamable” and have Engine Power > 250.
 The cars should be printed in order of appearing in the input.
Examples
Input
2
ChevroletAstro 200 180 1000 fragile 1.3 1 1.5 2 1.4 2 1.7 4
Citroen2CV 190 165 1200 fragile 0.9 3 0.85 2 0.95 2 1.1 1
fragile

Output
Citroen2CV


Input
4
ChevroletExpress 215 255 1200 flamable 2.5 1 2.4 2 2.7 1 2.8 1
ChevroletAstro 210 230 1000 flamable 2 1 1.9 2 1.7 3 2.1 1
DaciaDokker 230 275 1400 flamable 2.2 1 2.3 1 2.4 1 2 1
Citroen2CV 190 165 1200 fragile 0.8 3 0.85 2 0.7 5 0.95 2
flamable

Output
ChevroletExpress
DaciaDokker
                  */