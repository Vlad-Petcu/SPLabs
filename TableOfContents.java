package SP;

import SP.Element;
import SP.Visitor;
import java.util.ArrayList;

public class TableOfContents implements Element {
    private String name;
    private ArrayList<String> els = new ArrayList<String>();

    public TableOfContents(String name) {
        super();
        this.name = name;
    }
    @Override
    public void print() {
        System.out.println("TableOfContents with name: " + name);
        for(String s: els){
            if(s!=null){
                System.out.println(s);
            }
        }
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
        v.visitTableOfContents(this);
    }
    public void addEntry(String el){
        els.add(el);
    }
}
