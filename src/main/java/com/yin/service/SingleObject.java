package com.yin.service;

//恶汉式
public class SingleObject {

    private static SingleObject instance = new SingleObject();

    private SingleObject(){}

    public static SingleObject getInstance(){
        return instance;
    }

}

//懒汉式
class Single{
    private volatile static Single instance;

    private Single(){}
    //      线程不安全
    //    public static Single getInstance(){

    //线程安全
    public static Single getInstance(){
        if (instance == null){
            instance = new Single();
        }
        return instance;
    }

}

class Sin{
    private volatile static Sin instance;

    private Sin(){}

    public static Sin getInstance(){
        if (instance == null){
            synchronized (Sin.class){
                instance = new Sin();
            }
        }
        return instance;
    }
}
class SingleLang{
    private static class SingletonHolder {
        private static final SingleLang INSTANCE = new SingleLang();
    }
    private SingleLang (){}

    public static SingleLang getInstance(){
        return SingletonHolder.INSTANCE;
    }
}
