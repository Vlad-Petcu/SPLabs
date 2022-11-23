import java.util.ArrayList;
import java.util.List;

public class An implements Element {
    private String numeAn;
    private List<Element> listaElemente = new ArrayList<Element>();

    public An(String numeAn) {this.numeAn = numeAn;}

    public String getAn() {return numeAn;}

    public void setNumeAn(String numeAn) {
        this.numeAn = numeAn;
    }

    public List<Element> getListaElemente() {
        return listaElemente;
    }

    public void print()
    {
        System.out.println(this.numeAn + "\n");
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
        visitor.visitAn(this);
        for (Element el: listaElemente)
        {
            el.accept(visitor);
        }
    }
}

