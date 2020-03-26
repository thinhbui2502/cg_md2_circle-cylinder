public class Cylinder extends Circle {
    private double height = 1.0;

    public Cylinder() {

    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolumn() {
        return super.getArea() * this.height;
    }

    @Override
    public String toString() {
        return "Cylinder{"
                + "height="
                + height
                + '}'
                + " - Volumn: "
                + getVolumn();
    }
}
