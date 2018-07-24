package factory.module;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class XieBian {

    //使用Number和Integer证明数组具有协变性
    public static void main(String[] args) {
        Object[] objects = new Number[]{1,2,3};
        System.out.println(objects.getClass().getName());
        objects[0] = new Integer(10);

        System.out.println(objects[0]);

        List<? extends Number> list = new ArrayList<Number>();


//        list.add(new Integer(10));

        List<? extends Fruit> list1 = Arrays.asList(new Apple());

        Apple apple = (Apple) list1.get(0);

        System.out.println(list1.contains(apple));

        System.out.println(list1.indexOf(new Apple()));


    }

}

class Fruit{}

class Apple extends Fruit{

}