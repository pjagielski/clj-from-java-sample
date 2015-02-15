import clj.interop.Counter;
import clj.interop.SafeCounter;

public class InteropTest {
    public static void main(String args[]) {
        Counter c = new SafeCounter();
        System.out.println(c.value());
        c.inc();
        System.out.println(c.value());
    }
}
