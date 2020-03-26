public class TestCircle {
    public static void main(String[] args) {
        Circle circle1 =new Circle();
        System.out.println(circle1.toString());

        Circle circle2 = new Circle(5,"black");
        System.out.println(circle2.toString());
    }
}
