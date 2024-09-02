class Shape {
    void area() {
        System.out.println("Calculating Area");
    }
}

class Triangle extends Shape {
    double base;
    double height;

    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }
    void area() {
        double area = 0.5 * base * height;
        System.out.println("Area of Triangle: " + area);
    }
}

class Rectangle extends Shape {
    double length;
    double width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    void area() {
        double area = length * width;
        System.out.println("Area of Rectangle: " + area);
    }
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }
    void area() {
        double area = Math.PI * radius * radius;
        System.out.println("Area of Circle: " + area);
    }
}
public class Sn {
    public static void main(String[] args) {
        Shape shape = new Shape();
        shape.area(); 

        Triangle triangle = new Triangle(5, 4);
        triangle.area(); 

        Rectangle rectangle = new Rectangle(6, 3);
        rectangle.area(); 

        Circle circle = new Circle(2);
        circle.area(); 
    }
}

