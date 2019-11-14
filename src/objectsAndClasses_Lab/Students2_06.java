package objectsAndClasses_Lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Students2_06 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader
                (new InputStreamReader(System.in));

        List<Student> students = new ArrayList<>();

        String input = reader.readLine();
        while (!input.equals("end")) {
            String[] data = input.split("\\s+");

            String firstName = data[0];
            String lastName = data[1];
            int age = Integer.parseInt(data[2]);
            String homeTown = data[3];

            input = reader.readLine();
            if (isStudentExisting(students, firstName, lastName)) {
                Student student = getStudent(students, firstName, lastName);

                student.setFirstName(firstName);
                student.setLastName(lastName);
                student.setAge(age);
                student.setHomeTown(homeTown);
            } else {
                Student student = new Student(firstName, lastName, age, homeTown);
                students.add(student);
            }

            Student student = students.stream().
                    filter(s -> s.getFirstName().
                            equals(firstName) && s.getLastName().
                            equals(lastName)).
                    findFirst().
                    orElse(null);
            if (student == null) {
                Student studentToAdd = new Student(firstName, lastName, age, homeTown);
                studentToAdd.setFirstName(firstName);
                studentToAdd.setLastName(lastName);
                studentToAdd.setAge(age);
                studentToAdd.setHomeTown(homeTown);
            } else {
                student.setFirstName(firstName);
                student.setLastName(lastName);
                student.setAge(age);
                student.setHomeTown(homeTown);
            }

        }

        String homeSity = reader.readLine();
        for (Student student : students) {
            if (student.getHomeTown().equals(homeSity)) {
                System.out.printf("%s %s is %d years old%n", student.getFirstName(), student.getLastName(), student.getAge());
            }

        }

    }

    private static Student getStudent(List<Student> students, String firstName, String lastName) {
        Student existingStudent = null;
        for (Student student : students) {
            if(student.getFirstName().equals(firstName)&& student.getLastName().equals(lastName)){
                existingStudent = student;
            }
        }
        return existingStudent;
    }

    private static boolean isStudentExisting(List<Student> students, String firstName, String lastName) {
        for (Student student : students)
            if (student.getFirstName().equals(firstName) && student.getLastName().equals(lastName)) {
                return true;

            }
        return false;
    }

    private static class Student {
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
/*⦁	Students 2.0
Use the class from the previous problem.
 If you receive a student which already exists (first name and last name should be unique) overwrite the information.
Hints
Check if the given student already exists.


Overwrite the student information.
First, we have to find the existing student.


Finally, we have to overwrite the information.

We can use Stream API as well.

findFirst returns the first occurrence or null.

Examples
Input
John Smith 15 Sofia
John Smith 16 Sofia
Linda Bridge 17 Sofia
Simon Stone 12 Varna
end
Sofia

Output
John Smith is 16 years old.
Linda Bridge is 17 years old.
*/