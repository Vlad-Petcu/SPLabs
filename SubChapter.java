package SP;

import java.util.*;
import java.util.Arrays;

public class SubChapter {
    private String name;

    public SubChapter(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    List<Element> elList = new ArrayList<Element>();

    public void createNewParagraph(String newParagraph){
        Paragraph paragraph = new Paragraph(newParagraph);
        elList.add(paragraph);
    }

    public void createNewImage(String newImage){
        Image image = new Image(newImage);
        elList.add(image);
    }

    public void createNewTable(String newTable){
        Table table = new Table(newTable);
        elList.add(table);
    }
    public void print(){
        System.out.println("Subchapter: " + name);
        for(Element e:elList)
            e.print();
    }
}