package examsFundamentals.programmingFundamentalsMidExam_2November2019Group2;

import java.util.Arrays;
import java.util.Scanner;

public class FriendlistMaintenance02 {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

        String[] friends = scanner.nextLine().split(", ");

        String input = scanner.nextLine();

        while (!"Report".equals(input)) {
            String[] data = input.split("\\s+");
            String command = data[0];

            switch (command) {
                case "Blacklist":
                    String name = data[1];
                    if (Arrays.asList(friends).contains(name)) {
                        int indexName = Arrays.asList(friends).indexOf(name);
                        friends[indexName] = "Blacklisted";
                        System.out.printf("%s was blacklisted.%n", name);
                    } else {
                        System.out.printf("%s was not found.%n", name);
                    }
                    break;
                case "Error":
                    int index = Integer.parseInt(data[1]);
                    if (!friends[index].equals("Blacklisted") && !friends[index].equals("Lost")) {
                        String name1 = friends[index];
                        friends[index] = "Lost";
                        System.out.printf("%s was lost due to an error.%n", name1);
                    }
                    break;
                case "Change":
                    int indexNewName = Integer.parseInt(data[1]);
                    String newName = data[2];
                    if (indexNewName >= 0 && indexNewName < friends.length) {
                        String oldName = friends[indexNewName];
                        friends[indexNewName] = newName;
                        System.out.println(String.format("%s changed his username to %s.", oldName, newName));
                    }
                    break;
            }
            input = scanner.nextLine();
        }
        int countBlackListNames = 0;
        int countLostNames = 0;
        for (String friend : friends) {
            if (friend.equals("Blacklisted")) {
                countBlackListNames++;
            } else if (friend.equals("Lost")) {
                countLostNames++;
            }
        }

        scanner.close();
        System.out.printf("Blacklisted names: %d%n ", countBlackListNames);
        System.out.printf("Lost names: %d%n ", countLostNames);
        System.out.println(String.join(" ", friends));
    }
}

/*Our player is having trouble with his friend list and some guys are disappearing without
 a reason so he asks you to create a program that will figure out what is going on and at the end will bring him a report.
On the first line you will receive all his friends separated by ", ".

On the next lines until the "Report" command you will receive commands.

 The commands could be:
Blacklist {name}
Find the name in the friend list and change it to "Blacklisted" and print on the console:
"{name} was blacklisted."

If the name is not in the friend list print:
"{name} was not found."

Error {index}
Check if the username at the given index is not "Blacklisted" or "Lost".

 If it isn't, change the username to "Lost" and print on the console:
"{name} was lost due to an error."

Change {index} {newName}
Check if the user at index position is in range of the array.
If he is, change the current username with the new one and print on console:
"{currentName} changed his username to {newName}."

After you receive "Report" print on the console the count of blacklisted names,
the count of lost names, and the friend list separated by a single space.

Input
The first input line will contain the usernames that need to be stored.
On the next input lines until "Report" you will receive commands.
Output
The output should be in the following format:
"Blacklisted names: {blacklistedNamesCount}"
"Lost names: {lostNamesCount}"
"{name1} {name2} .. {nameN}"
Examples

Input
Mike, John, Eddie
Blacklist Mike
Error 0
Error 1
Change 2 Mike123
Report

Output
Mike was blacklisted.
John was lost due to an error.
Eddie changed his username to Mike123.
Blacklisted names: 1
Lost names: 1
Blacklisted Lost Mike123


Comments
On the first line are the names from the friendlist that need to be stored in an array.
After that the commands start to flow in. The first command finds Mike and blacklists him: "Mike was blacklisted."
After that "Error 0" failed because the name is already blacklisted and we do nothing.
"Error 1": John is replaced with "Lost" and the messange is sent to the console: "John was lost due to an error."
After that Mike changes his username to Mike123:  "Eddie changed his username to Mike123".
And the report is asked for so the program ends with the shown output.

Input
Mike, John, Eddie, William
Error 3
Error 3
Change 0 Mike123
Blacklist Eddie
Report

Output
William was lost due to an error.
Mike changed his username to Mike123.
Eddie was blacklisted.
Blacklisted names: 1
Lost names: 1
Mike123 John Blacklisted Lost
*/