package Decorator;

public class Milk implements MaterialService {
    @Override
    public void content() {
        System.out.println("my name is milk");
    }
}
