package solid_principles.liskov_substitution_principle;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Rectangle> rectangles = new ArrayList<>();
        rectangles.add(new Rectangle());
        rectangles.add(new Square());
        for (Rectangle rectangle : rectangles) {
            rectangle.setA(5);
            rectangle.setB(10);
            //TODO:почему 0 результат getSquare
            System.out.println(rectangle.getSquare());
        }
    }
}
