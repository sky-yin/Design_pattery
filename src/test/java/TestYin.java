import org.junit.Test;
import util.TailInvoke;

public class TestYin {
    @Test
    public void testYin(){
        System.out.println(TailInvoke.factorialTailRecursion(1,20).invoke());
    }
}
