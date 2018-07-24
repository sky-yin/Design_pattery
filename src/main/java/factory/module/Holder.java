package factory.module;

public class Holder<T> {
    private T value;

    public Holder(){}

    public Holder(T value){
        this.value = value;
    }

    public void set(T value){
        this.value = value;
    }

    public T get(){
        return value;
    }

    @Override
    public boolean equals(Object obj) {
        return value.equals(obj);
    }

    public static void main(String[] args) {
        /**
         * 转型    apple == ？ extends Fruit
         */
        Holder<Apple> appleHolder = new Holder<Apple>(new Apple());

        Apple d = appleHolder.get();

        Holder<? extends Fruit> fruit = appleHolder;

        Fruit f = fruit.get();

//        d = (Apple) fruit.get();

        System.out.println(fruit.equals(f));
    }
}