package SP;

import java.util.ArrayList;
import java.util.List;

public class Chapter {
    private String name;
    private List<SubChapter> subChapters = new ArrayList<SubChapter>();

    public Chapter(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int createSubChapter(String nameSubChapter){
        SubChapter sch = new SubChapter(nameSubChapter);
        subChapters.add(sch);
        return subChapters.indexOf(sch);
    }

    public SubChapter getSubChapter(int indexSubChapter){
        return subChapters.get(indexSubChapter);
    }

    public void print(){
        System.out.println(name);
    }
}
