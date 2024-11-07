
class Shape {
    public void draw() {
        System.out.println("Drawing Shape...");
    }
}
class Square extends Shape {
    public void draw() {
        System.out.println("Drawing Square...");
    }
}
class Circle extends Shape {
    public void draw() {
        System.out.println("Drawing Circle...");
    }
}

class Main {
    public static void main(String[] args) {
        // create an object of Square
        Square s1 = new Square();
        s1.draw();
        // create an object of Circle
        Circle c1 = new Circle();
        c1.draw();
    }
}

