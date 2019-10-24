package listsExercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class HouseParty03 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader
                (new InputStreamReader(System.in));

        int numOfCommands = Integer.parseInt(reader.readLine());
        List<String>listGuests = new ArrayList<>();
        String []commands = new String[numOfCommands];

        for (int i = 0; i < numOfCommands-1 ; i++) {
            commands = reader.readLine().split("\\s+");
            if(commands[i].length() == 3){
                listGuests.add(commands[0]);
            }else if(commands[i].length() == 4){

            }
        }
        }
    }


/* House Party
Write a program that keeps track of the guests that are going to a house party.
On the first input line you are going to receive how many commands you are going to have.
 On the next lines you are going to receive some of the following inputs:
“{name} is going!”
“{name} is not going!”
If you receive the first type of input, you have to add the person if he/she is not in the list.
(If he/she is in the list print on the console: “{name} is already in the list!”).
 If you receive the second type of input, you have to remove the person if he/she is in the list.
 (if not print: “{name} is not in the list!”). At the end print all the guests.
Examples
Input
4
Allie is going!
George is going!
John is not going!
George is not going!


Output
John is not in the list!
Allie


Input
5
Tom is going!
Annie is going!
Tom is going!
Garry is going!
Jerry is going!

Output
Tom is already in the list!
Tom
Annie
Garry
Jerry
*/