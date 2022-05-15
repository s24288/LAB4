public class Cylinder extends Circle{
    private double height = 4.0;

    public Cylinder() {
    }

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public double getHeight() {
        return this.height;
    }

    public double getVolume() {
        return 2 * Math.PI * super.getRadius() * this.height;
    }
}
