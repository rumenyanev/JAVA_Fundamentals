package mapsLambdaAndStreamAPI_Exercise;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentAcademy07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        LinkedHashMap<String, ArrayList<Double>>studentData = new LinkedHashMap<>();


        while (n -- > 0){
            String nameStudent = scanner.nextLine();
            double grade = Double.parseDouble(scanner.nextLine());
            if(!studentData.containsKey(nameStudent)){
                studentData.put(nameStudent,new ArrayList<>());
                studentData.get(nameStudent).add(grade);
            }else{
                studentData.get(nameStudent).add(grade);
            }

        }
        LinkedHashMap<String,Double>averageGrade = new LinkedHashMap<>();
        for (String name : studentData.keySet()) {
            double sum = 0 ;
            for (int i = 0; i <studentData.get(name).size() ; i++) {
            sum += studentData.get(name).get(i);

            }
            double average = sum / studentData.get(name).size();
            if(average >= 4.50){
                averageGrade.put(name,average);
            }

        }
        averageGrade.entrySet().stream().sorted(Map.Entry.<String, Double>comparingByValue().reversed()).forEach(entry->{
            System.out.println(String.format("%s -> %.2f",entry.getKey(),entry.getValue())
            );
        });
    }
}
/*Student Academy
Write a program, which keeps information about students and their grades.
You will receive n pair of rows. First you will receive the student's name, after that you will receive his grade.
Check if student already exists, and if not, add him. Keep track of all grades for each student.
When you finish reading data, keep students with average grade higher or equal to 4.50.
Order filtered students by average grade in descending.
Print the students and their average grade in format:
"{name} –> {averageGrade}"
Format the average grade to the 2nd decimal place.
Examples
Input
5
John
5.5
John
4.5
Alice
6
Alice
3
George
5


Output
John -> 5.00
George -> 5.00
Alice -> 4.50

Input
5
Amanda
3.5
Amanda
4
Rob
5.5
Christian
5
Robert
6

Output
Robert -> 6.00
Rob -> 5.50
Christian -> 5.00
                          */