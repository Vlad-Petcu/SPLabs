package SP;

import SP.Element;
import SP.Visitor;

import java.util.ArrayList;
import java.util.List;

public class Section implements Element {
    public String title;
    List<Element> elList = new ArrayList<Element>();

    public Section(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public void print() {
        System.out.println(title);
        for(Element el:elList)
            el.print();
    }

    @Override
    public void add(Element el) {
        elList.add(el);
    }

    @Override
    public void remove(Element el) {
        elList.remove(el);
    }

    @Override
    public int get(Element el) {
        return elList.indexOf(el);
    }

    @Override
    public void accept(Visitor v) {
        v.visitSection(this);

        for (Element el : elList) {
            el.accept(v);
        }
    }
}
