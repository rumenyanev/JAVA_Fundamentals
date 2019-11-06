package lists_Lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListOfProducts06 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader
                (new InputStreamReader(System.in));

        int numOfProducts = Integer.parseInt(reader.readLine());

        List<String>allProducts = new ArrayList<>();
        while (numOfProducts-- > 0){
            String products = reader.readLine();

            allProducts.add(products);
            Collections.sort(allProducts);
        }
        for (int i = 0; i <allProducts.size() ; i++) {
            System.out.printf("%d.%s%n",i + 1,allProducts.get(i));
        }
    }
}
/*⦁	List of products
Read a number n and n lines of products. Print a numbered list of all the products ordered by name.
Examples
Input
4
Potatoes
Tomatoes
Onions
Apples

Output
1.Apples
2.Onions
3.Potatoes
4.Tomatoes
Solution
              */