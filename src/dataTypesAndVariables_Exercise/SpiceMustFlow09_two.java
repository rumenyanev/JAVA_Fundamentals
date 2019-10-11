package dataTypesAndVariables_Exercise;

public class SpiceMustFlow09_two {
    public static void main(String[] args) {




        while (true) {

            if (spices >= 100) {
                sumSpice += spices;
                sumSpice -= 26;
                days++;
                spices = spices - 10;
            }else{
                System.out.println(days);
                System.out.println(sumSpice);
                break;
            }
        }
    }
}
