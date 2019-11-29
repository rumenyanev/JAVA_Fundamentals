package objectsAndClassesMoreExercise.carSalesman03;

public class Car {
    private String model;
    private Engine engine;
    private int weight;
    private String color;

    public Car(String model, Engine engine) {
        this.model = model;
        this.engine = engine;
        this.weight = 0;
        this.color = null;
    }

    public String getModel() {
        return model;
    }

    public Engine getEngine() {
        return engine;
    }

    public int getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return String.format("%s:%n %s:%n %d:%n %s:%n",this.model,this.engine,this.weight,this.color);
    }
}


/*Car Salesman
Define two classes Car and Engine.
A Car has a model, engine, weight and color. An Engine has model, power, displacement and efficiency.
A Car’s weight and color and its Engine’s displacements and efficiency are optional.
On the first line, you will read a number N which will specify how many lines of engines you will receive,
on each of the next N lines you will receive information about an Engine in the following format “<Model> <Power> <Displacement> <Efficiency>”.

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
Efficiency: <EngineEfficiency>
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
Efficiency: B
Weight: 1300
Color: Silver
FordMustang:
V8-101:
Power: 220
Displacement: 50
Efficiency: n/a
Weight: n/a
Color: n/a
VolkswagenGolf:
V4-33:
Power: 140
Displacement: 28
Efficiency: B
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
Efficiency: A+
Weight: n/a
Color: Purple
VolkswagenPolo:
V7-54:
Power: 190
Displacement: 30
Efficiency: D
Weight: 1200
Color: Yellow
VolkswagenPassat:
DSL-10:
Power: 280
Displacement: n/a
Efficiency: B
Weight: 1375
Color: Blue
FordFusion:
DSL-13:
Power: 305
Displacement: 55
Efficiency: A+
Weight: n/a
Color: n/a
*/