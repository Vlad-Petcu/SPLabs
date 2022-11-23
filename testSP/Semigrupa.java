import java.util.ArrayList;
import java.util.List;

public class Semigrupa implements Element {
    private String numeSemigrupa;
    private List<Element> listaElemente = new ArrayList<Element>();

    public Semigrupa(String numeSemigrupa) {this.numeSemigrupa = numeSemigrupa;}

    public String getSemigrupa() {return numeSemigrupa;}

    public void setNumeSemigrupa(String numeGrupa) {
        this.numeSemigrupa = numeSemigrupa;
    }

    public List<Element> getListaElemente() {
        return listaElemente;
    }

    public void print()
    {
        System.out.println("        " + this.numeSemigrupa + "\n");
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
        visitor.visitSemigrupa(this);
        for (Element el: listaElemente)
        {
            el.accept(visitor);
        }
    }
}
