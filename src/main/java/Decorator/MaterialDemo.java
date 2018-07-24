package Decorator;

public class MaterialDemo {
    public static void main(String[] args) {
        MaterialService milk = new MilkMaterialDecorator(new Milk());

        milk.content();

        MaterialService caramel = new MilkMaterialDecorator(new Caramel());

        caramel.content();

    }
}
