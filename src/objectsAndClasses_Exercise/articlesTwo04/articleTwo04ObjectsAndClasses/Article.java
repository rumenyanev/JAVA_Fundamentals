package objectsAndClasses_Exercise.articlesTwo04.articleTwo04ObjectsAndClasses;

public class Article {

        private String title;
        private String content;
        private String author;

    public Article(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }

    protected String getTitle() {
        return title;
    }

    protected String getContent() {
        return content;
    }

    protected String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return String.format("%s - %s: %s",
                this.getTitle(),
                this.getContent(),
                this.getAuthor());
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