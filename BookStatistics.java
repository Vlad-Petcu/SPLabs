package SP;

import SP.*;

public class BookStatistics implements Visitor {
    private int i = 0;
    private int p = 0;
    private int t = 0;


    @Override
    public void visitBook(Book b) {

    }

    @Override
    public void visitSection(Section s) {

    }

    @Override
    public void visitTableOfContents(TableOfContents table) {

    }

    @Override
    public void visitParagraph(Paragraph paragraph) {
        p++;
    }

    @Override
    public void visitImageProxy(ImageProxy image) {
        i++;
    }

    @Override
    public void visitImage(Image img) {
        i++;
    }

    @Override
    public void visitTable(Table table) {
        t++;
    }

    public void printStatistics() {
        System.out.println("visited paragraphs: " + p);
        System.out.println("visited images: " + i);
        System.out.println("visited tables: " + t);
    }
}