package mapsLambdaAndStreamAPI_Exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class CompanyUsers08 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader
                (new InputStreamReader(System.in));

        Map<String, List<String>> companiesData = new TreeMap<>();

        String inputInfo = reader.readLine();
        while (!"End".equals(inputInfo)) {

            String[] infoCompany = inputInfo.split("( -> )");
            String companyName = infoCompany[0];
            String ID = infoCompany[1];

            companiesData.putIfAbsent(companyName, new ArrayList<>());

            List<String> idEmployees = companiesData.get(companyName);
            if (!idEmployees.contains(ID)) {
                idEmployees.add(ID);
            }

            inputInfo = reader.readLine();
        }
        reader.close();

        companiesData
                .forEach((key, value) -> {
                    System.out.println(key);
                    value.forEach(e -> System.out.println("-- " + e));
                });
    }
}
/*Company Users
Write a program which keeps information about companies and their employees.
You will receive company name and employee's id, until you receive the command "End".
Add each employee to the given company. Keep in mind that a company cannot have two employees with the same id.
When you finish reading data, order the companies by the name in ascending order.
Print the company name and each employee's id in the following format:
{companyName}
-- {id1}
-- {id2}
-- {idN}
Input / Constraints
Until you receive "End", the input come in the format: "{companyName} -> {employeeId}".
The input always will be valid.
Examples

Input
SoftUni -> AA12345
SoftUni -> BB12345
Microsoft -> CC12345
HP -> BB12345
End


Output
HP
-- BB12345
Microsoft
-- CC12345
SoftUni
-- AA12345
-- BB12345

Input
SoftUni
-- AA12345
-- BB12345
SoftUni -> AA12345
SoftUni -> CC12344
Lenovo -> XX23456
SoftUni -> AA12345
Movement -> DD11111
End

Output
Lenovo
-- XX23456
Movement
-- DD11111
SoftUni
-- AA12345
-- CC12344
                      */