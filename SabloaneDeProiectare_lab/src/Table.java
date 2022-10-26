package Lab4;

public class Table implements Element {
    private String title;

    public Table(String title) {
        this.title = title;
    }
    public void print() {
        System.out.println("Table with title: " + title);
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
        if (!(e instanceof Table)) {
            return false;
        }
        else {
            return ((Table) e).title.equals(this.title);
        }
    }
}