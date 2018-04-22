package factory.abstractFactory;

import factory.abstractFactory.Color;

public class Green implements Color {
    @Override
    public void fill() {
        System.out.println("the color is green");
    }
}
