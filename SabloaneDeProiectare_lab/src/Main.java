import models.*;
import services.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Book book = new Book("Titlu carte");
        Author rpGheo = new Author("Nume autor");
        book.addAuthor(rpGheo);
        //book.addContent(new Paragraph("Multumesc celor care ..."));
        Section cap1 = new Section("Capitolul 1");
        Section subcap1 = new Section("Subcapitolul 1");
        book.addContent(cap1);
        cap1.add(new Table("Tabel 1"));
        cap1.add(new Image("Image cap1"));
        cap1.add(new Paragraph("Moto capitol"));
        cap1.add(subcap1);
        subcap1.add(new Paragraph("Text from subchapter 2"));
        subcap1.add(new Image("Image subcapitol1"));
        cap1.add(new Table("Tabel 2"));
        Section cap2 = new Section("Capitolul 2");
        book.addContent(cap2);

        ToCVisitor v = new ToCVisitor();
        book.accept(v);
        v.printContent();
    }
}
