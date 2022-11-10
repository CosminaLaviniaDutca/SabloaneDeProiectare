package services;
import models.*;

public interface Visitor {
    public void visitBook(Book b);
    public void visitSection(Section s);
    public void visitTableOfContents(TableOfContents table);
    public void visitParagraph(Paragraph p);
    public void visitImageProxy(ImageProxy image);
    public void visitImage(Image img);
    public void visitTable(Table tbl);
}
