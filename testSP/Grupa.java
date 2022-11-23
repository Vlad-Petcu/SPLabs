import java.util.ArrayList;
import java.util.List;

public class Grupa implements Element {
    private String numeGrupa;
    private List<Element>  listaElemente = new ArrayList<Element>();

    public Grupa(String numeGrupa) {this.numeGrupa = numeGrupa;}

    public String getGrupa() {return numeGrupa;}

    public void setNumeGrupa(String numeGrupa) {
        this.numeGrupa = numeGrupa;
    }

    public List<Element> getListaElemente() {
        return listaElemente;
    }

    public void print()
    {
        System.out.println("    " + this.numeGrupa + "\n");
        for(int i = 0; i < listaElemente.size(); i++){
            listaElemente.get(i).print();
        }
        System.out.println("\n");
    }

    @Override
    public void add(Element addElement) {
        listaElemente.add(addElement);
    }


    @Override
    public int get(Element getElement) {
        return 0;
    }

    public void accept(Visitor visitor) {
        visitor.visitGrupa(this);
        for (Element el: listaElemente)
        {
            el.accept(visitor);
        }
    }
}
