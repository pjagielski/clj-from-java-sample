package counter;

import org.junit.Test;
import safe_counter.Counter;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CounterTest {

    private Counter counter = new Counter();

    @Test
    public void shouldCount() {
        assertThat(counter.value(), is(0));
        counter.inc();
        assertThat(counter.value(), is(1));
    }

}
