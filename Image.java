package SP;

import java.util.concurrent.TimeUnit;

public class Image implements Element {
    private String url;
    private String ImageContent;

    public Image(String url) {
        this.url = url;
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public String getImageName() {
        return url;
    }

    public void setImageName(String url) {
        this.url = url;
    }

    public void print(){
        System.out.println("Image with name: " + url);
    }

    public void content(){

    }

    @Override
    public void add(Element el) {

    }

    @Override
    public void remove(Element el) {

    }

    @Override
    public int get(Element el) {
        return 0;
    }
}
