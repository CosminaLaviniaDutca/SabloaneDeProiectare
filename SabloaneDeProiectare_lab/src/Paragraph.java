package Lab4;

public class Paragraph implements Element {
    private String text;

    public Paragraph(String text) {
        this.text = text;
    }
    public void print(){
        System.out.println("Paragraph: " + text);
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
        if (!(e instanceof Paragraph)) {
            return false;
        }
        else {
            return ((Paragraph) e).text.equals(this.text);
        }
    }
}
