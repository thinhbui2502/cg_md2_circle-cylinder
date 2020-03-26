public class TestCylinder {
    public static void main(String[] args) {
        Cylinder cylinder1 = new Cylinder();
        System.out.println(cylinder1.toString());

        Cylinder cylinder2 = new Cylinder(3,"blue",6);
        System.out.println(cylinder2.toString());
    }
}
