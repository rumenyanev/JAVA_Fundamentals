package objectsAndClasses_Exercise.articlesTwo04.articleTwo04ObjectsAndClasses;

import objectsAndClasses_Exercise.articlesTwo04.articleTwo04ObjectsAndClasses.Article;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader =
                new BufferedReader
                        (new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());


        List<Article> articleList = new ArrayList<>();

        while (n-- > 0) {
            String[] data = reader.readLine().split(", ");
            Article article = new Article(data[0], data[1], data[2]);
            articleList.add(article);
        }
        String command = reader.readLine();

        switch (command) {
            case "title":
                articleList.sort
                        (Comparator.comparing(Article::getTitle));
                break;
            case "content":
                articleList.sort(Comparator.comparing(Article::getContent));
                break;
            case "author":
                articleList.sort(Comparator.comparing(Article::getAuthor));
                break;
        }
        for (Article article : articleList) {
            String s = article.toString();
            System.out.println(s);
        }
       }

    }



/*Articles 2.0
Change the program, so you can store a list of articles. You will not need the methods any more (except the ToString method). On the first line, you will get a number n. On the next n lines, you will get some articles in the same format as the previous task ("{title}, {content}, {author}"). Finally, you will get one of the three inputs: "title", "content", "author". You need to order the articles alphabetically based on the command and print them sorted by the given criteria.
Example
Input
2
Science, planets, Bill
Article, content, Johnny
title


Output
Article - content: Johnny
Science - planets: Bill



Input
3
title1, C, author1
title2, B, author2
title3, A, author3
content

Output
title3 – A: author3
title2 – B: author2
title1 – C: author1
*/