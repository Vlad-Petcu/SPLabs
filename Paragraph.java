package SP;

import SP.AlignmentStrategy;
import SP.Visitor;

public class Paragraph implements Element {
    private String text;
    private AlignmentStrategy alignStrategy;

    public Paragraph(String text) {
        this.text = text;
        this.alignStrategy = null;
    }

    public String getText() {
        return text;
    }

    public void print(){
        if(alignStrategy == null)
            System.out.println("Paragraph: " + text);
        else
            System.out.println(alignStrategy);

    }

    @Override
    public void add(Element el) {

    }

    @Override
    public void remove(Element el) {

    }

    @Override
    public void accept(Visitor v) {
        v.visitParagraph(this);
    }

    @Override
    public int get(Element el) {
        return 0;
    }

    public void setAlignStrategy(AlignmentStrategy alignStrategy) {
        alignStrategy.render(new Paragraph(text));
    }
}
