package Lab4;

public class TableOfContents implements Element {
        private String name;
        public TableOfContents(String name) {
            super();
            this.name = name;
        }
        public void print() {
            System.out.println("TableOfContents with name: " + name);
        }
}

