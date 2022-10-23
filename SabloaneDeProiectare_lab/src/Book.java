import java.util.ArrayList;
import java.util.List;

public class Book {
    private String title;
    private List<String> paragraphs;
    private List<String> images;
    private List<String> tables;

    public Book(String title) {
        this.title = title;
        this.paragraphs = new ArrayList<>();
        this.images = new ArrayList<>();
        this.tables = new ArrayList<>();
    }
    public void createNewParagraph(String paragraph) {
        paragraphs.add(paragraph);
    }
    public void createNewImage(String image) {
        images.add(image);
    }
    public void createNewTable(String table) {
        tables.add(table);
    }
    public void print() {
        System.out.println(this.title);
        for(String p: paragraphs){
            System.out.println(p);
        }
        for(String i: images){
            System.out.println(i);
        }
        for(String t: tables){
            System.out.println(t);
        }
    }
}
