package factory.module;

public class Parameter {

    static void testint(){
        String className = Test.class.getName();

        Class testClass;

        Object object;

        {
            try {
                testClass = Class.forName(className);
                try {
                    object = testClass.newInstance();
                } catch (InstantiationException e) {
                    e.printStackTrace();
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }

    }


    public static void main(String[] args) {
        testint();
    }

}

class Test{
    Integer a;
    Test(Integer a){
        this.a = a;
    }

    void get(){
        System.out.println(a);
    }
}
