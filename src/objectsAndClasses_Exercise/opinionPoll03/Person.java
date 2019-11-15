package objectsAndClasses_Exercise.opinionPoll03;

public class Person {
    private String name;
    private  int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return String.format("%s - %d",
                this.getName(),this.getAge());
    }
}
/*Opinion Poll
Using the Person class, write a program that reads from the console N lines of personal
information and then prints all people whose age is more than 30 years, sorted in alphabetical order.
Note: you can use stream() to filter people.
Examples
Input
3
Pesho 12
Stamat 31
Ivan 48

Output
Ivan - 48
Stamat – 31


Input
5
Nikolai 33
Yordan 88
Tosho 22
Lyubo 44
Stanislav 11

Output
Lyubo - 44
Nikolai - 33
Yordan – 88
                  */