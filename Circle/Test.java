package Circle;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Circle circle = new Circle(1.0);
        ResizableCircle recircle = new ResizableCircle(1.0);

        System.out.println(circle.toString());
        recircle.resize(85);
        System.out.println(recircle.toString());
    }

}
