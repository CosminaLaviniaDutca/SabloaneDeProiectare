import java.util.ArrayList;

public class SubChapter{
    private String name;
    private ArrayList<Paragraph> paragraphs = new ArrayList<>();
    private ArrayList<Image> images = new ArrayList<>();
    private ArrayList<Table> tables = new ArrayList<>();

    public SubChapter(String name) {
        this.name = name;
    }
    public void print() {
        System.out.println("Subchapter: " + name);
        for(Paragraph p : paragraphs) {
            System.out.print("Paragraph: ");
            p.print();
        }
        for(Image i : images) {
            System.out.print("Image with name: ");
            i.print();
        }
        for(Table t : tables) {
            System.out.print("Table with Title: ");
            t.print();
        }
    }
    public void createNewParagraph(String s) {
        Paragraph paragraph = new Paragraph(s);
        paragraphs.add(paragraph);
    }
    public void createNewImage(String s) {
        Image image = new Image(s);
        images.add(image);
    }
    public void createNewTable(String s) {
        Table table = new Table(s);
        tables.add(table);
    }
}
