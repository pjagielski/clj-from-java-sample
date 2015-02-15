package counter;

import clj.interop.Counter;
import clj.interop.SafeCounter;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CounterTest {

    private Counter counter = new SafeCounter();

    @Test
    public void shouldCount() {
        assertThat(counter.value(), is(0));
        counter.inc();
        assertThat(counter.value(), is(1));
    }

}
