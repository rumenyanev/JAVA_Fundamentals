package mapsLambdaAndStreamAPI_Exercise;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SoftUniExamResults10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> studentsAndGrades = new HashMap<>();
        Map<String, Integer> solutions = new HashMap<>();
        String input ;
        while (!"exam finished".equals(input = scanner.nextLine())) {
            String[] data = input.split("-");

            if (data.length == 3) {
                String name = data[0];
                String language = data[1];
                int points = Integer.parseInt(data[2]);
                if (!studentsAndGrades.containsKey(name)) {
                    studentsAndGrades.put(name, points);
                } else if (studentsAndGrades.get(name) < points) {
                    studentsAndGrades.put(name, points);
                }

                if (!solutions.containsKey(language)) {
                    solutions.put(language, 1);
                } else {
                    solutions.put(language, solutions.get(language) + 1);
                }
            } else {
                studentsAndGrades.remove(data[0]);
            }

        }

        System.out.println("Results:");
        studentsAndGrades.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue()
                        .reversed()
                        .thenComparing(Map.Entry.comparingByKey()))
                .forEach(entry -> {
                    System.out.println(String.format("%s | %d",
                            entry.getKey(), entry.getValue()));
                });

        System.out.println("Submissions:");
        solutions.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue()
                        .reversed()
                        .thenComparing(Map.Entry.comparingByKey()))
                .forEach(entry -> {
                    System.out.println(String.format("%s - %d",
                            entry.getKey(), entry.getValue()));
                });

    }
}
/*SoftUni Exam Results
Judge statistics on the last Programing Fundamentals exam was not working correctly,
so you have the task to take all the submissions and analyze them properly.
You should collect all the submission and print the final results and statistics about each
language that the participants submitted their solutions in.
You will be receiving datas in the following format: "{username}-{language}-{points}" until you receive "exam finished". 
You should store each username and his submissions and points.
You can receive a command to ban a user for cheating in the following format: "{username}-banned". 
In that case, you should remove the user from the contest, but preserve his submissions in the total count of submissions for each language.
After receiving "exam finished" print each of the participants, ordered descending by their max points, then by username, in the following format:
Results:
{username} | {points}
…
After that print each language, used in the exam, ordered descending by total submission count and then by language name, in the following format:
Submissions:
{language} – {submissionsCount}
…
Input / Constraints
Until you receive "exam finished" you will be receiving participant submissions in the following format: "{username}-{language}-{points}".
You can receive a ban command -> "{username}-banned"
The points of the participant will always be a valid integer in the range [0-100];
Output
Print the exam results for each participant, ordered descending by max points and then by username, in the following format:
Results:
{username} | {points}
…
After that print each language, ordered descending by total submissions and then by language name, in the following format:
Submissions:
{language} – {submissionsCount}
…
Allowed working time / memory: 100ms / 16MB.

Examples

Input
Pesho-Java-84
Gosho-C#-70
Gosho-C#-84
Kiro-C#-94
exam finished

Output
Results:
Kiro | 94
Gosho | 84
Pesho | 84
Submissions:
C# - 3
Java - 1

Comment
We order the participant descending by max points and then by name,
printing only the username and the max points.
After that we print each language along with the count of submissions,
ordered descending by submissions count, and then by language name.

Input
Pesho-Java-91
Gosho-C#-84
Kiro-Java-90
Kiro-C#-50
Kiro-banned
exam finished

Output
Results:
Pesho | 91
Gosho | 84
Submissions:
C# - 2
Java - 2


Comment
Kiro is banned so he is removed from the contest,
but he`s submissions are still preserved in the languages submissions count.
So althou there are only 2 participants in the results, there are 4 submissions in total.
                                                                                            */