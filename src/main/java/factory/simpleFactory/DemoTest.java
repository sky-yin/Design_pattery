package factory.simpleFactory;

import java.util.ArrayList;
import java.util.List;

public class DemoTest {

    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();
        Shape shapeOne = factory.getShape("Circle");
        shapeOne.draw();

        Shape shapeTwo = factory.getShape("Square");
        shapeTwo.draw();

        List<String> stringList = new ArrayList<>();
        List<Integer> integerList = new ArrayList<>();
        System.out.println(stringList.getClass().getName() == integerList.getClass().getName());
    }


}
