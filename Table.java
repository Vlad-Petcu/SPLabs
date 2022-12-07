package SP;

import SP.Element;
import SP.Visitor;

public class Table implements Element {
    private String title;

    public Table(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void print(){
        System.out.println("Table with title: " + title);
    }

    @Override
    public void add(Element el) {

    }

    @Override
    public void remove(Element el) {

    }

    @Override
    public int get(Element el) {
        return 0;
    }

    @Override
    public void accept(Visitor v) {
        v.visitTable(this);
    }

}
