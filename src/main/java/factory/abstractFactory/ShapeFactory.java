package factory.abstractFactory;


import factory.abstractFactory.Circle;
import factory.abstractFactory.Rectangle;
import factory.abstractFactory.Shape;
import factory.abstractFactory.Square;
import org.apache.commons.lang.StringUtils;

public class ShapeFactory extends AbstractFactory{

    public Shape getShape(String parameter){
        if (StringUtils.isBlank(parameter)){
            return null;
        }
        Shape shape = null;
        switch (parameter){
            case "Rectangle":
                shape =  new Rectangle();break;
            case "Square":
                shape =  new Square();break;
            case "Circle":
                shape = new Circle();break;
        }
        return shape;
    }

    @Override
    Color getColor(String color) {
        return null;
    }
}
