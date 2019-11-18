package objectsAndClasses_Exercise.vehicleCatalogue06;

public class Vehicle {
    private String type;
    private String model;
    private String color;
    private int horsepower;

    public Vehicle(String type, String model, String color, int horsepower) {
        this.type = type;
        this.model = model;
        this.color = color;
        this.horsepower = horsepower;
    }

    public String getType() {
        return this.type;
    }

    public String getModel() {
        return this.model;
    }

    public String getColor() {
        return this.color;
    }

    public int getHorsepower() {
        return this.horsepower;
    }

    @Override
    public String toString() {
        return String.format("Type: %s\n" +
                        "Model: %s\n" +
                        "Color: %s\n" +
                        "Horsepower: %d",
                this.getType().toUpperCase().
                        charAt(0) + this.getType().
                        substring(1),
                this.getModel(),
                this.getColor(),
                this.getHorsepower());
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