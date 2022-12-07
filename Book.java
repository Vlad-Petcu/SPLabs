package SP;

import java.util.*;
import SP.Visitor;

public class Book extends Section implements Element{
    private List<Author> authors = new ArrayList<Author>();
    private List<Chapter> chapters = new ArrayList<Chapter>();
    public Book(String title) {
        super(title);
        this.title = title;
    }

    public void addContent(Element el){
        elList.add(el);
    }

    public void addAuthor(Author a){
        authors.add(a);
    }

    public int createChapter(String nameChapter){
        Chapter ch = new Chapter(nameChapter);
        chapters.add(ch);
        return chapters.indexOf(ch);
    }

    public Chapter getChapter(int indexChapter){
        return chapters.get(indexChapter);
    }

    public void print(){
        System.out.println("Book:"+title);
        System.out.println();
        System.out.println("Authors:");
        for(Author a :authors)
            a.print();
        System.out.println();
        for(Element el:elList)
            el.print();
    }

    @Override
    public void accept(Visitor v) {
        super.accept(v);
    }

}
