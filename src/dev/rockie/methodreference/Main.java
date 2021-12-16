package dev.rockie.methodreference;

public class Main {

    public static void main(String[] args) {

        Square square = new Square(4);

//        Shapes shapes = (Square s) -> {
//            return s.calculateArea();
//        };

        Shapes shapes = Square::calculateArea;

//        Shapes shapes = (Square s) -> s.calculateArea();

        System.out.println(shapes.getArea(square));
    }
}
