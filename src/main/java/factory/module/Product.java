package factory.module;


import java.util.ArrayList;
import java.util.List;

public class Product {

    private final int id;

    private String description;

    private double price;

    public Product(int id, String description, double price) {
        this.id = id;
        this.description = description;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", price=" + price +
                '}';
    }

    public void priceChange(double change){
        price += change;
    }

    public static void main(String[] args) {
        GreenColor<Integer> greenColor = new GreenColor<>();

        Integer color = greenColor.getType(10);

        GreenColor<String> stringGreenColor = new GreenColor<>();

        System.out.println(greenColor.getClass().getName() == stringGreenColor.getClass().getName());

        System.out.println(stringGreenColor.getClass().getName());
    }

}
