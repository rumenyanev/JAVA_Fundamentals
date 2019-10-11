package basicSyntaxConditionalStatementsAndLoops_Exercise;

import java.util.Scanner;

public class Ages01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age = scanner.nextInt();

       if(age>=0 && age<=2){
           System.out.println("baby");
       }else if (age>=3 && age <= 13){
           System.out.println("child");
       }else if(age>=14 && age <= 19){
           System.out.println("teenager");
       }else if(age>=20&& age<=65){
           System.out.println("adult");
       }else if(age >=66){
           System.out.println("elder");
       }
    }
}
/*Ages
Write a program that determines whether based on the given age a person is: baby, child, teenager, adult, elder. The bounders are:
0-2 – baby;
3-13 – child;
14-19 – teenager;
20-65 – adult;
>=66 – elder;
All the values are inclusive.
Examples
Input
20

Output
adult

Input
1

Output
baby

Input
100

Output
elder
*/