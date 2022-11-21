package services;

import models.*;

public class ToCVisitor implements Visitor{
    private TableOfContents ToC = new TableOfContents("Contents");
    private int nrPag = 1;

    @Override
    public void visitBook(Book b) {}


    @Override
    public void visitSection(Section s) {
        String nameS = s.getName();
        if(!isStringNull(nameS)) {
                String cont = nameS + "........ pag" + nrPag;
                ToC.addEntry(cont);
            }
    }

    @Override
    public void visitTableOfContents(TableOfContents table) {}

    @Override
    public void visitParagraph(Paragraph p) { nrPag++; }

    @Override
    public void visitImageProxy(ImageProxy image) {
        nrPag++;
    }

    @Override
    public void visitImage(Image img) {
        nrPag++;
    }

    @Override
    public void visitTable(Table tbl) {
        nrPag++;
    }

    public void printContent() { ToC.print(); }

    public static boolean isStringNull(String str) {
        return str == null;
    }
}
