package factory.abstractFactory;

import org.apache.commons.lang.StringUtils;

public class ColorFactory extends AbstractFactory {

    @Override
    Shape getShape(String shape) {
        return null;
    }

    public Color getColor(String parameter){
        if (StringUtils.isBlank(parameter)){
            return null;
        }
        Color color = null;
        switch (parameter){
            case "Red":
                color = new Red();break;
            case "Green":
                color = new Green();break;
            case "Orange":
                color = new Orange();break;
        }
        return  color;
    }

}
