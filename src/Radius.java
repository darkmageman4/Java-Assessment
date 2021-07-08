public class Radius {

    private double radius;

    private double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double circumference(double radius) {
        return 2 * Math.PI * radius;
    }

    public double circumference(int radius) {
        return 2 * Math.PI * radius;
    }

}
