package factory.simpleFactory;


import org.apache.commons.lang.StringUtils;

public class ShapeFactory {

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
}
