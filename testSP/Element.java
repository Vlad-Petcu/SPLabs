public interface Element {
    public void print();
    public void add(Element addElement);
    public int get(Element getElement);
    public void accept(Visitor visitor);
}
