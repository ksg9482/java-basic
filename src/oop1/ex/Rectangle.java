package oop1.ex;

public class Rectangle {
    int width;
    int height;

    static Rectangle initRectangle(int widthValue, int heightValue) {
        Rectangle rectangle = new Rectangle();
        rectangle.width = widthValue;
        rectangle.height = heightValue;
        return rectangle;
    }
    int area() {
        int area = width * height;
        System.out.println("넓이: " + area);
        return area;
    }

    int perimeter() {
        int perimeter = 2 * (width + height);
        System.out.println("둘레: " + perimeter);
        return perimeter;
    }

    boolean isSquare() {
        boolean isSquare = width == height;
        System.out.println("정사각형: " + isSquare);
        return isSquare;
    }
}
