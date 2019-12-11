package examsFundamentals.programmingFundamentalsMidExam_2November2019Group2;

import java.util.Scanner;

public class ExperienceGaining01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double neededExperience = Double.parseDouble(scanner.nextLine());
        int countOfBattles = Integer.parseInt(scanner.nextLine());


        double sumExperience = 0.0;
        int count = 0;
        for (int i = 1; i < countOfBattles +1 ; i++) {
            double experience = Double.parseDouble(scanner.nextLine());
            sumExperience += experience;
            count++;
            if (i % 3 == 0) {
                sumExperience += experience * 0.15;
            } else if (i % 5 == 0) {
                sumExperience -= experience * 0.10;
            }
            if(sumExperience >= neededExperience){
                System.out.printf("Player successfully collected his needed experience for %d battles.", count);
                break;
            }
        }

         if(sumExperience< neededExperience) {
            System.out.printf("Player was not able to collect the needed experience, %.2f more needed.", neededExperience - sumExperience);
        }

    }
}
/*Write a program, that helps a player figure how many battles he will need to play in a battle video game,
in order to unlock the next tank in the line.
On the first line you will receive the amount of experience that is needed to unlock the tank.
On the second line you will receive the count of battles.
On the next lines, you will receive the experience the player can gain in every battle.
Calculate if he can unlock the tank.
Keep in mind that he gets 15% more experience for every third battle and 10% less for every fifth battle.
You also need to stop the program as soon as he collects the needed experience.
If he managed to gather the experience, print how many battles it took him in the following format:

"Player successfully collected his needed experience for {battleCount} battles."

If he was not able to do it, print the following message:

"Player was not able to collect the needed experience, {neededExperience} more needed."

Format the needed experience to the second decimal place.
Input
On the first line you will receive the needed experience amount –  a real number in the range [0.0….400000.0]
On the second line you will receive the count of battles – an integer number in the range
[0….500]
On the next lines you will receive the experience earned per battle – a real number in the range
[0.0….5000.0]
Output
If he managed to gather the experience:
"Player successfully collected his needed experience for {battleCount} battles."
If he was not able to do it:
"Player was not able to collect the needed experience, {neededExperience} more needed."
NOTE: Format the needed experience to the second decimal place.
Examples
Input
500
5
50
100
200
100
30


Output
Player successfully collected his needed experience for 5 battles.


Comments
The first line is the amount of the wanted experience.  – "500"
The second line is the expected battles for which he has to collect the experience.  – "5"
After that is the experience received for every battle:
50 + 100 + (200 + (200 * 15 %)) + 100 + (30 – (30 * 10 %)) = 507
So on the console is printed :
"Player successfully collected his needed experience for 5 battles."

Input
500
5
50
100
200
100
20

Output
Player was not able to collect the needed experience, 2.00 more needed.



Input
400
5
50
100
200
100
20


Player successfully collected his needed experience for 4 battles.
                                                                     */