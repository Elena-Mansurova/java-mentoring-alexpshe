package hardPracticeTask2;

public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * (radius * radius);
    }

    public double calculateCircumference() {
        return (2 * Math.PI * (radius * radius)) / (Math.PI * radius);
    }

    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        circle.setRadius(2.0);
        System.out.println(circle.calculateArea());
        System.out.println(circle.calculateCircumference());
    }
}
