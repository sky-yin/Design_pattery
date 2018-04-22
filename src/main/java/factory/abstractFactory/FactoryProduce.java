package factory.abstractFactory;

public class FactoryProduce{

    public static AbstractFactory getAbstractFactory(String parameter){
        if(parameter.equals("color")){
            return new ColorFactory();
        }else {
            return new ShapeFactory();
        }
    }

}
