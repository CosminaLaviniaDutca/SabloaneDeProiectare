import java.util.ArrayList;

public class Section implements Element {
    private String name;
    private ArrayList<Element> elements = new ArrayList<>();

    public Section() {
    }
    public Section(String name) {
        this.name = name;
    }
    public void print(){
        if(name!=null){
            System.out.println(name);
        }
        for (Element el : elements) {
            el.print();
        }
    }
    public void add(Element e) throws Exception {
        this.elements.add(e);
    }
    public Element get(int poz) {
        if (poz < 0 || poz >= this.elements.size()) {
            return null;
        }
        return this.elements.get(poz);
    }
    public void remove(Element e) {
        this.elements.remove(e);
    }
}
