package BasicJava;
class Rectangle {
    double length;
    double breadth;

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public double area() {
        double result = length * breadth;
        return Math.round(result * 100.0) / 100.0;
    }

    public double perimeter() {
        double result = 2 * (length + breadth);
        return Math.round(result * 100.0) / 100.0;
    }
public class AreaPerimeter {
    public static void main(String args[]) {
        Rectangle rectangle = new Rectangle(12.2, 43.2);
        System.out.println("Area of the rectangle is " + rectangle.area());
        System.out.println("Perimeter of the rectangle is " + rectangle.perimeter());
    }
}


}
