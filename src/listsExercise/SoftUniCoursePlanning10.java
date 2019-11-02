package listsExercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SoftUniCoursePlanning10 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader
                (new InputStreamReader(System.in));


        List<String> result = new ArrayList<>();
        List<String> lessons = Arrays.stream(reader.readLine()
                .split(", "))
                .collect(Collectors.toList());

        String dataLessons = reader.readLine();

        while (!"course start".equals(dataLessons)) {
            String[] commandArr = dataLessons.split(":");
            String command = commandArr[0];
            switch (command) {
                case "Add":
                    result = addLessons(lessons, commandArr[1]);
                    break;
                case "Insert":
                    result = insertLessons(lessons, commandArr[1], Integer.parseInt(commandArr[2]));
                    break;
                case "Remove":
                    result = removeLessons(lessons, commandArr[1]);
                    break;
                case "Swap":
                    result = swapLessons(lessons, commandArr[1], commandArr[2]);
                    break;
                case "Exercise":
                    result = exerciseLessons(lessons, commandArr[1]);
                    break;
            }
            dataLessons = reader.readLine();
        }
        for (int i = 0; i < result.size(); i++) {
            System.out.println(i + 1 + "." + result.get(i));

        }

    }

    private static List<String> addLessons(List<String> lessons, String lessonTitle) {
        lessons.add(lessonTitle);
        return lessons;
    }

    private static List<String> insertLessons(List<String> lessons, String lessonTitle, int index) {
        if (!(index < 0 || index > lessons.size()-1 )) {
            if (!lessons.contains(lessonTitle)) {
                lessons.add(index, lessonTitle);

            }
        }
        return lessons;
    }

    private static List<String> removeLessons(List<String> lessons, String lessonTitle) {
        String nameOfLessons = lessonTitle;
        String nameOfLessonsExersice = lessonTitle + "-Exercise";
        for (int i = 0; i < lessons.size(); i++) {
            String searchLesonsTitle = lessons.get(i);
            if (searchLesonsTitle.equals(nameOfLessonsExersice)) {
                lessons.remove(nameOfLessonsExersice);
            }
        }
        for (int i = 0; i < lessons.size(); i++) {
            String searchLesson = lessons.get(i);
            if (searchLesson.equals(nameOfLessons)) {
                lessons.remove(nameOfLessons);


            }
        }
        return lessons;
    }

    private static List<String> swapLessons(List<String> lessons, String lesson, String secondLesson) {
        int firstLessonIndex = lessons.indexOf(lesson);
        int secondLessonIndex = lessons.indexOf(secondLesson);
        if (firstLessonIndex != -1 && secondLessonIndex != -1) {

            lessons.set(secondLessonIndex, lesson);
            lessons.set(firstLessonIndex, secondLesson);

            if (firstLessonIndex + 1 < lessons.size() && lessons.get(firstLessonIndex + 1).contains(lesson + "-Exercise")) {
                String course = lessons.get(firstLessonIndex + 1);
                lessons.remove(firstLessonIndex + 1);
                lessons.add(secondLessonIndex + 1, course);
            }

            if (secondLessonIndex + 1 < lessons.size() &&
                    lessons.get(secondLessonIndex + 1).contains(secondLesson + "-Exercise")) {
                String course = lessons.get(secondLessonIndex + 1);
                lessons.remove(secondLessonIndex + 1);
                lessons.add(firstLessonIndex + 1, course);
            }
            
        
        }
        return lessons;
    }


    private static List<String> exerciseLessons(List<String> lessons, String lessonTitle) {
        String lessonTitleExer = lessonTitle + "-Exercise";

        if (!(lessons.contains(lessonTitle))) {
            lessons.add(lessonTitle);
            lessons.add(lessonTitleExer);
        } else if (lessons.contains(lessonTitle)) {
            if (!lessons.contains(lessonTitleExer)) {
                int position = lessons.indexOf(lessonTitle);
                lessons.add(position + 1, lessonTitleExer);
            }
        }
        return lessons;
    }
}
/*SoftUni Course Planning
You are tasked to help planning the next Programing Fundamentals course by keeping track of the lessons, that are going to be included in the course, as well as all the exercises for the lessons.
On the first input line you will receive the initial schedule of lessons and exercises that are going to be part of the next course,
separated by comma and space ", ". But before the course starts, there are some changes to be made. Until you receive "course start"
 you will be given some commands to modify the course schedule. The possible commands are:
Add:{lessonTitle} – add the lesson to the end of the schedule, if it does not exist.
Insert:{lessonTitle}:{index} – insert the lesson to the given index, if it does not exist.
Remove:{lessonTitle} – remove the lesson, if it exists.
Swap:{lessonTitle}:{lessonTitle} – change the place of the two lessons, if they exist.
Exercise:{lessonTitle} – add Exercise in the schedule right after the lesson index, if the lesson exists and there is no exercise already, in the following format "{lessonTitle}-Exercise". If the lesson doesn`t exist, Add the lesson in the end of the course schedule, followed by the Exercise.
Each time you Swap or Remove a lesson, you should do the same with the Exercises, if there are any, which follow the lessons.
Input / Constraints
first line – the initial schedule lessons – strings, separated by comma and space ", "
until "course start" you will receive commands in the format described above
Output
Print the whole course schedule, each lesson on a new line with its number(index) in the schedule:
"{lesson index}.{lessonTitle}"
Allowed working time / memory: 100ms / 16MB.
Examples

Input
Data Types, Objects, Lists
Add:Databases
Insert:Arrays:0
Remove:Lists
course start

Output
1.Arrays
2.Data Types
3.Objects
4.Databases


Comment
We receive the initial schedule.
Next, we add Databases lesson, because it doesn`t exist.
We Insert at the given index lesson Arrays, because its not present in the schedule.
After receiving the last command and removing lesson Lists, we print the whole schedule.
Input
Arrays, Lists, Methods
Swap:Arrays:Methods
Exercise:Database
Swap:Lists:Databases
Insert:Arrays:0
course start

Output
1.Methods
2.Databases
3.Databases-Exercise
4.Arrays
5.Lists


Comment
We swap the given lessons, because both exist.
After receiving the Exercise command, we see that such lesson doesn`t exist, so we add the lesson at the end, followed by the exercise.
We swap Lists and Databases lessons, the
Databases-Exercise is also moved after the Databases lesson.
We skip the next command, because we already have such lesson in our schedule.
*/