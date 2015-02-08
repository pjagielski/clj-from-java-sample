import safe_counter.Counter;

public class InteropTest {
    public static void main(String args[]) {
        Counter c = new Counter();
        System.out.println(c.value());
        c.inc();
        System.out.println(c.value());
    }
}
