package objectsAndClasses_Exercise.orderByAge07;

public class Persons {
    private String name;
    private String ID;
    private int age;

    public Persons(String name, String ID, int age) {
        this.name = name;
        this.ID = ID;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public String getId() {
        return this.ID;
    }

    public int getAge() {
        return this.age;
    }

    @Override
    public String toString() {
        return String.format("%s with ID: %s is %d years old.",this.getName(),this.getId(),this.getAge());
    }
}
/*Order by Age
You will receive an unknown number of lines. On each line, you will receive array with 3 elements.
The first element will be string and represents the name of the person.
The second element will be a string and will represent the ID of the person.
The last element will be an integer and represents the age of the person.
When you receive the command “End”, stop taking input and print all the people, ordered by age.

Examples

Input
Georgi 123456 20
Pesho 78911 15
Stefan 524244 10
End

Output
Stefan with ID: 524244 is 10 years old.
Pesho with ID: 78911 is 15 years old.
Georgi with ID: 123456 is 20 years old.
                                             */