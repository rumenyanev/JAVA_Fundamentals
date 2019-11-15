package objectsAndClasses_Exercise.opinionPoll03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader
                (new InputStreamReader(System.in));

        int numInputLines = Integer.parseInt(reader.readLine());
        List<Person> people = new ArrayList<>();

        while (numInputLines -- > 0) {
            String[] data = reader.readLine().split("\\s+");

            Person person = new Person(data[0], Integer.parseInt(data[1]));
            people.add(person);
        }

        people.
                stream().
                filter(person -> person.getAge() > 30).
                sorted(Comparator.comparing(Person::getName)).
                forEach(person -> {
                    System.out.println(person.toString());
                });

    }
}
/*Opinion Poll
Using the Person class, write a program that reads from the console N lines of personal information and then prints all people whose age is more than 30 years, sorted in alphabetical order.
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