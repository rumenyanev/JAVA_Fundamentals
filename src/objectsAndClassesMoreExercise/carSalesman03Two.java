package objectsAndClassesMoreExercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

public class carSalesman03Two {

        public static class Car {
            private String model;
            private Engine engine;
            private String weight;
            private String color;

            public Car(String model, Engine engine, String weight, String color) {
                this.model = model;
                this.engine = engine;
                this.weight = weight;
                this.color = color;
            }

            public String getModel() {
                return model;
            }

            public Engine getEngine() {
                return engine;
            }

            public String getWeight() {
                return weight;
            }

            public String getColor() {
                return color;
            }

            @Override
            public String toString() {
                Engine engine = this.getEngine();
                return String.format("%s:%n%s%n  Weight: %s%n  Color: %s",
                        model, engine.toString(), weight, color);
            }
        }

        public static class Engine {
            private String model;
            private int power;
            private String displacement;
            private String efficiency;

            public Engine(String model, int  power,String displacement, String efficiency) {
                this.model = model;
                this.power = power;
                this.displacement = displacement;
                this.efficiency = efficiency;
            }


            public String getModel() {
                return model;
            }

            public int getPower() {
                return power;
            }

            public String getDisplacement() {
                return displacement;
            }

            public String getEfficiency() {
                return efficiency;
            }

            @Override
            public String toString() {
                return String.format("  %s:%n    Power: %d%n    Displacement: %s%n    Efficiency: %s",
                        model,power,displacement,efficiency);
            }
        }
        public static void main(String[] args) throws IOException {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            int numOfDataEngine = Integer.parseInt(reader.readLine());

            List<Car> carList = new LinkedList<>();
            List<Engine> engineList = new LinkedList<>();

            while (numOfDataEngine-- > 0){
                String[] inputDataEngine = reader.readLine().split(" ");
                String model = inputDataEngine[0];
                int power = Integer.parseInt(inputDataEngine[1]);
                String displacement = "n/a";
                String efficiency = "n/a";

                if (inputDataEngine.length == 4){
                    displacement = inputDataEngine[2];
                    efficiency = inputDataEngine[3];
                } else if (inputDataEngine.length == 3){
                    try {
                        int disp = Integer.parseInt(inputDataEngine[2]);
                        displacement = inputDataEngine[2];
                    } catch (Exception e){
                        efficiency = inputDataEngine[2];
                    }
                }
                Engine engine = new Engine(model,power,displacement,efficiency);
                engineList.add(engine);

            }
            int numOfDataCar = Integer.parseInt(reader.readLine());

            while (numOfDataCar-- > 0){
                String[] inputDataCar = reader.readLine().split(" ");
                String model = inputDataCar[0];
                String engineName = inputDataCar[1];
                String weight = "n/a";
                String color = "n/a";


                if (inputDataCar.length == 4){
                    weight = inputDataCar[2];
                    color = inputDataCar[3];
                } else if (inputDataCar.length == 3){
                    try {
                        int test = Integer.parseInt(inputDataCar[2]);
                        weight = inputDataCar[2];
                    } catch (Exception e){
                        color = inputDataCar[2];
                    }
                }
                Engine currentEngine = engineList.stream().filter(x -> x.getModel().equals(engineName))
                        .findFirst().get();
                Car car = new Car(model,currentEngine,weight,color);
                carList.add(car);


            }

            for (Car car : carList){
                System.out.println(car.toString());
            }
        }

    }
/*Car Salesman
Define two classes Car and Engine.
A Car has a model, engine, weight and color. An Engine has model, power, displacement and efficiency.
A Car’s weight and color and its Engine’s displacements and efficiency are optional.
On the first line, you will read a number N which will specify how many lines of engines you will receive,
on each of the next N lines you will receive information about an Engine in the following format “<Model> <Power> <Displacement> <efficiency>”.

After the lines with engines, on the next line you will receive a number M – specifying the number of Cars
that will follow, on each of the next M lines information about a Car will follow in the following format “<Model> <Engine> <Weight> <Color>”,
 where the engine in the format will be the model of an existing Engine.
 When creating the object for a Car, you should keep a reference to the real engine in it,
 instead of just the engine’s model, note that the optional properties might be missing from the formats.
Your task is to print each car (in the order you received them) and its information in the format defined bellow,
 if any of the optional fields has not been given print "n/a" in its place instead:
<CarModel>:
<EngineModel>:
Power: <EnginePower>
Displacement: <EngineDisplacement>
efficiency: <Engineefficiency>
Weight: <CarWeight>
Color: <CarColor>
Optional
Override the classes’s ToString() methods to have a reusable way of displaying the objects.
Examples
Input
2
V8-101 220 50
V4-33 140 28 B
3
FordFocus V4-33 1300 Silver
FordMustang V8-101
VolkswagenGolf V4-33 Orange


Output
FordFocus:
V4-33:
Power: 140
Displacement: 28
efficiency: B
Weight: 1300
Color: Silver
FordMustang:
V8-101:
Power: 220
Displacement: 50
efficiency: n/a
Weight: n/a
Color: n/a
VolkswagenGolf:
V4-33:
Power: 140
Displacement: 28
efficiency: B
Weight: n/a
Color: Orange


Input
4
DSL-10 280 B
V7-55 200 35
DSL-13 305 55 A+
V7-54 190 30 D
4
FordMondeo DSL-13 Purple
VolkswagenPolo V7-54 1200 Yellow
VolkswagenPassat DSL-10 1375 Blue
FordFusion DSL-13




Output
FordMondeo:
DSL-13:
Power: 305
Displacement: 55
efficiency: A+
Weight: n/a
Color: Purple
VolkswagenPolo:
V7-54:
Power: 190
Displacement: 30
efficiency: D
Weight: 1200
Color: Yellow
VolkswagenPassat:
DSL-10:
Power: 280
Displacement: n/a
efficiency: B
Weight: 1375
Color: Blue
FordFusion:
DSL-13:
Power: 305
Displacement: 55
efficiency: A+
Weight: n/a
Color: n/a
                 */