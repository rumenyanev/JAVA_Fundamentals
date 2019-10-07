package basicSyntaxConditionalStatementsAandLoopsLab;

import java.util.Scanner;

public class BackIn30Minutes04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());

        minutes = minutes + 30;
        if (hours < 23 && minutes > 59) {
            hours += 1;
            minutes -= 60;
        }

        if (hours >= 23 && minutes >= 59) {
            hours = 0;
            minutes -= 60;
        }
        if(minutes<10){
            System.out.printf("%d:0%d", hours, minutes);

        }else{
            System.out.printf("%d:%d",hours,minutes);
        }
    }

}
/*⦁	Back in 30 Minutes
Every time Stamat tries to pay his bills he sees on the cash desk the sign: "I will be back in 30 minutes". One day Stamat was sick of waiting and decided he needs a program, which prints the time after 30 minutes. That way he won’t have to wait on the desk and come at the appropriate time. He gave the assignment to you, so you have to do it.
Input
The input will be on two lines. On the first line, you will receive the hours and on the second you will receive the minutes.
Output
Print on the console the time after 30 minutes. The result should be in format "hh:mm". The hours have one or two numbers and the minutes have always two numbers (with leading zero).

Constraints
⦁	The hours will be between 0 and 23.
⦁	The minutes will be between 0 and 59.
Examples
Input
1
46

Output
2:16

Input
0
01

Output
0:31

Input
23
59

Output
0:29

Input
11
08

Output
11:38

Input
11
32

Output
12:02

Hints
⦁	Add 30 minutes to the initial minutes, which you receive from the console. If the minutes are more than 59 – increase the hours with 1 and decrease the minutes with 60. The same way check if the hours are more than 23. When you print check for leading zero.
*/