package interfaceRealize;

public class Test {
    public static void main(String[] args) {

        Shape[] shapes = new Shape[6];

        shapes[0] = new Circle(5, "red", true);
        shapes[1] = new Square(5, "blue", true);
        shapes[2] = new Rectangle(2, 3, "white", false);
        shapes[3] = new Circle(10, "orange", true);
        shapes[4] = new Square(10, "yellow", true);
        shapes[5] = new Rectangle(4, 6, "black", false);


        System.out.println("before increase ");
        for (Shape shape : shapes) {
            System.out.println(shape);
        }
        System.out.println("after increase");


        for (int i = 0; i < shapes.length; i++) {

            if (shapes[i] instanceof Circle) {              //chuyển kiểu Shape sang các kiểu circle square và ractangle để truy cập vào get area và resize()
                Circle circle = (Circle) shapes[i];
                circle.resize(2);
                System.out.println(circle);

            } else if (shapes[i] instanceof Square) {
                Square square = (Square) shapes[i];
                square.resize(2);
                System.out.println(square);

            } else if (shapes[i] instanceof Rectangle) {
                Rectangle rectangle = (Rectangle) shapes[i];
                rectangle.resize(2);
                System.out.println(rectangle
                );
            }
        }

    }
}



