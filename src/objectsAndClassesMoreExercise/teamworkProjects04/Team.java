package objectsAndClassesMoreExercise.teamworkProjects04;

import java.util.ArrayList;
import java.util.List;

class Team {
    private final String name;
    private String creator;
    private final List<String> members;

    Team(String name, String creator) {
        this.name = name;
        this.creator = creator;
        this.members = new ArrayList<>();
    }

    void setCreator(String creator) {
        this.creator = creator;
    }

    void addMember(String nameOfMember) {
        if (!this.members.contains(nameOfMember)) {
            this.members.add(nameOfMember);
        }
    }

    public String getName() {
        return name;
    }

    String getCreator() {
        return creator;
    }

    List<String> getMembers() {
        return members;
    }

    int getCountMembers() {
        return this.members.size();
    }

    boolean isHasMember(String name) {
        return this.members.contains(name);
    }
}
/*Teamwork projects
It's time for teamwork projects and you are responsible for making the teams.
First you will receive an integer - the count of the teams you will have to register.
You will be given a user and a team (separated with “-”).  The user is the creator of that team.

For every newly created team you should print a message:
"Team {team Name} has been created by {user}!".

Next you will receive user with team (separated with "->") which means that the user wants to join that team.
Upon receiving the command: “end of assignment”, you should print every team, ordered by the count of its members (descending) and then by name (ascending).
For each team (disband teams as well), you have to print its members sorted by name (ascending). However, there are several rules:
If user tries to create a team more than once a message should be displayed:
"Team {teamName} was already created!"
Creator of a team cannot create another team - message should be thrown:
"{user} cannot create another team!"
If user tries to join currently non-existing team a message should be displayed:
"Team {teamName} does not exist!"
Member of a team cannot join another team - message should be thrown:
"Member {user} cannot join team {team Name}!"
In the end (after teams' report) teams with zero members (with only a creator) should disband ordered by name in ascending other.
 Every valid team should be printed ordered by name (ascending) in this format:
"{teamName}:
- {creator}
-- {member}…"



Examples
Input
2
Didi-PowerPuffsCoders
Toni-Toni is the best
Petq->PowerPuffsCoders
Toni->Toni is the best
end of assignment

Output
Team PowerPuffsCoders has been created by Didi!
Team Toni is the best has been created by Toni!
Member Toni cannot join team Toni is the best!
PowerPuffsCoders
- Didi
-- Petq
Teams to disband:
Toni is the best

Comments
	Toni created a team in which he tried later to join. So message was shown.
	Since there is no one other who is trying to join his team the team have to disband.

Input
3
Tatyana-CloneClub
Helena-CloneClub
Trifon-AiNaBira
Pesho->aiNaBira
Pesho->AiNaBira
Tatyana->Leda
PeshO->AiNaBira
Cossima->CloneClub
end of assignment

Output
Team CloneClub has been created by Tatyana!
Team CloneClub was already created!
Team AiNaBira has been created by Trifon!
Team aiNaBira does not exist!
Team Leda does not exist!
AiNaBira
- Trifon
-- Pesho
-- PeshO
CloneClub
- Tatyana
-- Cossima
Teams to disband:

Comments
Note that when you join a team you should check first if it exists, then check if the user is already in a team:
Tatyana has created CloneClub, then she tries to join a non-existing team – so message for non-existing team is shown.
*/