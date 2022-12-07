package SP;

import SP.*;

public class ToCVisitor implements Visitor{
    private TableOfContents ToC = new TableOfContents("Contents");
    private int nrp = 1;

    @Override
    public void visitBook(Book b) {}


    @Override
    public void visitSection(Section s) {
        String nameS = s.getTitle();
        if(!isStringNull(nameS)) {
            String cont = nameS + "--> page --> " + nrp;
            ToC.addEntry(cont);
        }
    }

    @Override
    public void visitTableOfContents(TableOfContents table) {}

    @Override
    public void visitParagraph(Paragraph p) { nrp++; }

    @Override
    public void visitImageProxy(ImageProxy image) {
        nrp++;
    }

    @Override
    public void visitImage(Image img) {
        nrp++;
    }

    @Override
    public void visitTable(Table tbl) {
        nrp++;
    }

    public void printContent() { ToC.print(); }

    public static boolean isStringNull(String str) {
        return str == null;
    }
}
