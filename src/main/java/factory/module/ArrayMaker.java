package factory.module;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayMaker<T> {
    private Class<T> kind;

    public ArrayMaker(Class<T> kind) {
        this.kind = kind;
    }

    @SuppressWarnings("unchecked")
    T[] create(int size){
        return (T[]) Array.newInstance(kind,size);
    }

    public String getType(){
        return kind.getName();
    }

    public static void main(String[] args) {
        ArrayMaker<String> stringArrayMaker = new ArrayMaker<String>(String.class);

        System.out.println(stringArrayMaker.getType());

        String[] stringArray = stringArrayMaker.create(9);
        System.out.println(Arrays.toString(stringArray));
    }

}
