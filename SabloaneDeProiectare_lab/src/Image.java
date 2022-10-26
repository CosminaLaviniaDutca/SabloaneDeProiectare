package Lab4;

import java.util.concurrent.TimeUnit;

public class Image implements Element, Picture {
    private String imageName;
    private Dimension dim;

    public Image(String imageName) {
        this.imageName = imageName;
        try {
            TimeUnit.SECONDS.sleep( 5 );
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.dim = new Dimension(1, 2);
    }
    public void print(){
        System.out.println("Image with name: " + imageName);
    }
    @Override
    public void add(Element e) {
    }
    @Override
    public Element get(int poz) {
        return null;
    }
    @Override
    public void remove(Element e) {
    }
    @Override
    public boolean find(Element e) {
        if (!(e instanceof Image)) {
            return false;
        }
        else {
            return ((Image) e).imageName.equals(this.imageName);
        }
    }
    @Override
    public String url() {
        return imageName;
    }
    @Override
    public Dimension dim() {
        return this.dim;
    }
}