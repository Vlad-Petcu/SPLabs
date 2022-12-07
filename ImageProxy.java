package SP;

import SP.Element;
import SP.Image;
import SP.Visitor;

import java.awt.*;

public class ImageProxy implements Element {
    private String url;
    private Dimension dim;

    private SP.Image realImage;

    public ImageProxy(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Dimension getDim() {
        return dim;
    }

    public void setDim(Dimension dim) {
        this.dim = dim;
    }

    public SP.Image loadImage(){
        if(realImage == null){
            realImage = new Image(url);
        }
        return realImage;
    }

    @Override
    public void print() {
        loadImage().print();
    }

    @Override
    public void add(Element el) {

    }

    @Override
    public void remove(Element el) {

    }

    @Override
    public void accept(Visitor v) {
        v.visitImageProxy(this);
    }

    @Override
    public int get(Element el) {
        return 0;
    }
}
