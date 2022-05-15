public class TestCircleAndCylinder {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        System.out.println("Circle1 Radius: " + circle1.getRadius());
        System.out.println("Circle1 Area: " + circle1.getArea());
        System.out.println(circle1);

        Circle circle2 = new Circle(10);
        System.out.println("Circle2 Radius: " + circle2.getRadius());
        System.out.println("Circle2 Area: " + circle2.getArea());
        System.out.println(circle2);

        Cylinder cylinder1 = new Cylinder();
        System.out.println("Cylinder1 Height: " + cylinder1.getHeight());
        System.out.println("Cylinder1 Volume: " + cylinder1.getVolume());
        System.out.println(cylinder1);

        Cylinder cylinder2 = new Cylinder(20);
        System.out.println("Cylinder2 Height: " + cylinder2.getHeight());
        System.out.println("Cylinder2 Volume: " + cylinder2.getVolume());
        System.out.println(cylinder2);

        Cylinder cylinder3 = new Cylinder(8, 10);
        System.out.println("Cylinder3 Height: " + cylinder3.getHeight());
        System.out.println("Cylinder3 Volume: " + cylinder3.getVolume());
        System.out.println(cylinder3);
    }
}
