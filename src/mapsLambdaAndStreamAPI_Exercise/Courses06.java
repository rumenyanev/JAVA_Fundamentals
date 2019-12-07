package mapsLambdaAndStreamAPI_Exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Courses06 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader
                (new InputStreamReader(System.in));


        Map<String, List<String>> coursesData = new LinkedHashMap<>();

        String line = reader.readLine();
        while (!"end".equals(line)) {
            String[] inputInfo = line.split(" : ", 2);
            String course = inputInfo[0];
            String studentName = inputInfo[1];
            coursesData.putIfAbsent(course, new ArrayList<>());
            List<String> currData = coursesData.get(course);
            currData.add(studentName);
            Collections.sort(currData);
            line = reader.readLine();
        }

        coursesData
                .entrySet()
                .stream()
                .sorted((f, s) -> Integer.compare(s.getValue().size(), f.getValue().size()))
                .forEach(element -> {
                    System.out.println(String.format("%s: %d", element.getKey(), element.getValue().size()));
                    element.getValue().forEach(e -> System.out.println("-- " + e));
                });
    }
}
/*dataCourses
Write a program, which keeps information about dataCourses. Each course has a name and registered students.
You will receive course name and student name, until you receive the command "end".
Check if such course already exists, and if not, add the course.
Register the user into the course. When you do receive the command "end",
print the dataCourses with their names and total registered users, ordered by the count of registered users in descending order.
For each contest print registered users ordered by name in ascending order.
Input
Until you receive "end", the input come in the format: "{courseName} : {studentName}".
The product data is always delimited by " : ".
Output
Print information about each course, following the format:
"{courseName}: {registeredStudents}"
Print information about each student, following the format:
"-- {studentName}"
Examples

Input
Programming Fundamentals : John Smith
Programming Fundamentals : Linda Johnson
JS Core : Will Wilson
Java Advanced : Harrison White
end

Output
Programming Fundamentals: 2
-- John Smith
-- Linda Johnson
JS Core: 1
-- Will Wilson
Java Advanced: 1
-- Harrison White


Input
Algorithms : Jay Moore
Programming Basics : Martin Taylor
Python Fundamentals : John Anderson
Python Fundamentals : Andrew Robinson
Algorithms : Bob Jackson
Python Fundamentals : Clark Lewis
end


Output
Python Fundamentals: 3
-- Andrew Robinson
-- Clark Lewis
-- John Anderson
Algorithms: 2
-- Bob Jackson
-- Jay Moore
Programming Basics: 1
-- Martin Taylor
*/