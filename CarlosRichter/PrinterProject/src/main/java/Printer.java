public class Printer {
    public static void main(final String[] args) {
        // System.out.println("hola\n perro");
        final Rectangle rectangle = new Rectangle("+", 4, 6);
        System.out.println(rectangle.print());
        final Triangle triangle = new Triangle("%", 5);
        triangle.print();
    }

}
