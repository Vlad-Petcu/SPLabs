package SP;

import SP.Visitor;

public interface Element {
    public void print();

    public void add(Element el);
    public void remove(Element el);
    public int get(Element el);
    public void accept(Visitor v);

}
