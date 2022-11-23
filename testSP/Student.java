import java.util.ArrayList;
import java.util.List;

public class Student implements Element {
    private String numeStudent;
    private String emailStudent;
    private List<Element> listaElemente = new ArrayList<Element>();

    public Student(String numeStudent, String emailStudent) {this.numeStudent = numeStudent; this.emailStudent = emailStudent;}

    public String getStudent() {return numeStudent;}

    public void setNumeSemigrupa(String numeGrupa) {
        this.numeStudent = numeStudent;
    }

    public List<Element> getListaElemente() {
        return listaElemente;
    }

    public void print()
    {
        System.out.println("                " + this.numeStudent + ", " + this.emailStudent + "\n");
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
        visitor.visitStudent(this);
        for (Element el: listaElemente)
        {
            el.accept(visitor);
        }
    }
}
