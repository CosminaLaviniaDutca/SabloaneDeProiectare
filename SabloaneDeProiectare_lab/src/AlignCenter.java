public class AlignCenter implements AlignStrategy {

    @Override
    public void render(Paragraph p, Context c) {
        System.out.println("Paragraph: " + p.getName() + " align center");
    }

}