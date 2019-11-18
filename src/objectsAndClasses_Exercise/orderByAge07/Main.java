package objectsAndClasses_Exercise.orderByAge07;

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

        String line = reader.readLine();
        List<Persons> personsList = new ArrayList<>();

        while (!"End".equals(line)) {
            String[] dataPersons = line.split("\\s+");

            Persons persons = new Persons(dataPersons[0],
                    dataPersons[1],
                    Integer.parseInt(dataPersons[2]));
            personsList.add(persons);
            line = reader.readLine();
        }




        personsList.stream().
                sorted(Comparator.comparingInt(Persons::getAge)).
                forEach(persons -> System.out.println(persons.toString()));
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