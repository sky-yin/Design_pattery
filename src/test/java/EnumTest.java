public enum EnumTest {

    START{
        void getInfo(){
            System.out.println("start !!!");
        }
    },

    LOADING{
        void getInfo(){
            System.out.println("loading !!!");
        }
    },

    STOP{
        void getInfo(){
            System.out.println("stop !!!");
        }
    };

    abstract void getInfo();

    public static void main(String[] args) {
        START.getInfo();
    }
}
