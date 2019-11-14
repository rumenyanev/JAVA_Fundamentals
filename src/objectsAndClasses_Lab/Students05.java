package objectsAndClasses_Lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Students05 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader
                (new InputStreamReader(System.in));

        List<Student>students = new ArrayList<>();

        String input = reader.readLine();
        while (!input.equals("end")){
            String[]data = input.split("\\s+");

            String firstName = data[0];
            String lastName = data[1];
            int age = Integer.parseInt(data[2]);
            String homeTown = data[3];

            Student student = new Student(firstName,lastName,age,homeTown);

            students.add(student);
            input = reader.readLine();
        }
        String homeSity = reader.readLine();
        for (Student student : students) {
            if(student.getHomeTown().equals(homeSity)){
                System.out.printf("%s %s is %d years old%n",student.getFirstName(),student.getLastName(),student.getAge());
            }

        }


    }
    private static class Student{
        private String firstName;
        private String lastName;
        private int age;
        private String homeTown;

        public Student(String firstName, String lastName, int age, String homeTown) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.homeTown = homeTown;
        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getHomeTown() {
            return homeTown;
        }

        public void setHomeTown(String homeTown) {
            this.homeTown = homeTown;
        }
    }


}
/*⦁	Students
Define a class Student, which holds the following information about students: first name, last name, age and hometown.
Read list of students until you receive "end" command. After that, you will receive a city name.
Print only students which are from the given city, in the following format: "{firstName} {lastName} is {age} years old.".
Examples
Input
John Smith 15 Sofia
Peter Ivanov 14 Plovdiv
Linda Bridge 16 Sofia
Simon Stone 12 Varna
end
Sofia

Output
John Smith is 15 years old
Linda Bridge is 16 years old


Input
Anthony Taylor 15 Chicago
David Anderson 16 Washington
Jack Lewis 14 Chicago
David Lee 14 Chicago
end
Chicago

Output
Anthony Taylor is 15 years old
Jack Lewis is 14 years old
David Lee is 14 years old
                                     */