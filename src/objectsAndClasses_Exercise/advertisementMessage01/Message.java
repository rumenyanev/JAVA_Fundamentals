package objectsAndClasses_Exercise.advertisementMessage01;

import java.util.Random;

public class Message {

    private String[]phrases = {"Excellent product.", "Such a great product.", "I always use that product.",
            "Best product of its category.", "Exceptional product.", "I can’t live without this product."};

    private String[]events = {"Now I feel good.", "I have succeeded with this product.", "Makes miracles. I am happy of the results!",
            "I cannot believe but now I feel awesome.", "Try it yourself, I am very satisfied.", "I feel great!"};

    private String[]authors = {"Diana", "Petya", "Stella", "Elena", "Katya", "Iva", "Annie", "Eva"};

    private String[]cities = {"Burgas", "Sofia", "Plovdiv", "Varna", "Ruse"};

    private Random random = new Random();

    public String randomMessage(){
        return String.format("%s %s %s-%s",
                phrases[random.nextInt(phrases.length)],
                events[random.nextInt(events.length)],
                authors[random.nextInt(authors.length)],
                cities[random.nextInt(cities.length)]);
    }

}
/*Advertisement Message
Write a program that generate random fake advertisement message to extol some product.
The messages must consist of 4 parts: laudatory phrase + event + author + city. Use the following predefined parts:
Phrases – {"Excellent product.", "Such a great product.", "I always use that product.", "Best product of its category.", "Exceptional product.", "I can’t live without this product."}
Events – {"Now I feel good.", "I have succeeded with this product.", "Makes miracles. I am happy of the results!", "I cannot believe but now I feel awesome.", "Try it yourself, I am very satisfied.", "I feel great!"}
Authors – {"Diana", "Petya", "Stella", "Elena", "Katya", "Iva", "Annie", "Eva"}
Cities – {"Burgas", "Sofia", "Plovdiv", "Varna", "Ruse"}
The format of the output message is: {phrase} {event} {author} – {city}.
As an input, you take the number of messages to be generated. Print each random message at a separate line.
Examples

Input
3

Output
Such a great product. Now I feel good. Elena – Ruse
Excelent product. Makes miracles. I am happy of the results! Katya – Varna
Best product of its category. That makes miracles. Eva - Sofia
*/