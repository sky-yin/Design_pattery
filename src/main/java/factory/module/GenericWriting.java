package factory.module;

import java.util.ArrayList;
import java.util.List;

public class GenericWriting {

    static <T> void writeExact(List<T> list,T item){
        list.add(item);
    }

    static List<Apple> apples = new ArrayList<>();

    static List<Fruit> fruits = new ArrayList<>();

    static void f1(){
        writeExact(apples,new Apple());
    }

    static <T> void writeExactCard(List<? super T> list,T item){
        list.add(item);
    }

    static void f2(){
        writeExactCard(apples,new Apple());
        writeExactCard(fruits,new Apple());
    }

    static void list(List list){
        for (Object o:list){
            System.out.println(o);
        }
    }

    public static void main(String[] args) {
        f1();
        f2();
        list(apples);
        System.out.println();
        list(fruits);
    }

}
