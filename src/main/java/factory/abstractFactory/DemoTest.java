package factory.abstractFactory;

import factory.abstractFactory.Shape;
import factory.abstractFactory.ShapeFactory;

public class DemoTest {

    public static void main(String[] args) {
        AbstractFactory abstractFactory = FactoryProduce.getAbstractFactory("color");
        Color color = abstractFactory.getColor("Red");
        color.fill();

        abstractFactory = FactoryProduce.getAbstractFactory("shape");
        Shape shape = abstractFactory.getShape("Square");
        shape.draw();
    }



}
