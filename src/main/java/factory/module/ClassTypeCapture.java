package factory.module;

import java.util.Map;

/**
 * 范型问题，不知道为什么  kind.isInstance(createNew(typeName))验证不通过
 * @param <T>
 */

public class ClassTypeCapture<T> {

    private Class<T> kind;

    private Map<String,Class<?>> map;

    public void addType(String typeName,Class<T> kind){

//        Object object = createNew(typeName);

        //这儿为什么过不去呢。
        System.out.println("kind is class "+kind.getName());//factory.module.Builder
        System.out.println("object is class "+createNew(typeName));//class factory.modual.Builder
//        System.out.println(kind.isInstance(createNew(typeName)));
        Object o = createNew(typeName);
        if (kind.isInstance(o)){
            map.put(typeName,kind);
        }

    }

    public void getMap(){
        for (Map.Entry<String,Class<?>> entry:map.entrySet()){
            System.out.println("key:"+entry.getKey()+"--value:"+entry.getValue());
        }
    }

    private Object createNew(String typeName){
        Object object = null;
        try {
            object = Class.forName(typeName).newInstance();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
        return object;
    }


    private ClassTypeCapture(Class<T> kind){
        this.kind = kind;
    }

    public boolean getInstance(Object obj){
        return kind.isInstance(obj);
    }

    public static void main(String[] args) {
        ClassTypeCapture<Builder> builderClass = new ClassTypeCapture<>(Builder.class);

        Builder builder = new Builder();
        System.out.println(builderClass.getInstance(builder));
        Builder house = new House();
        System.out.println(builderClass.getInstance(house));


        builderClass.addType(house.getClass().getSuperclass().getName(),Builder.class);
//        builderClass.addType(builder.getClass().getName(),House.class);
        builderClass.getMap();


    }

}


class Builder{
    void init(){
        System.out.println("the builder init");

    }
};


class House extends Builder{
    void init(){
        System.out.println("the house init");

    }
};