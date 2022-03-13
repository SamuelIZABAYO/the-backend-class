import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {

    Fibonacci fibonacci = new Fibonacci();

    @Test
    void number0shouldReturn0() {
        assertThat(fibonacci.fib(0)).isEqualTo(0);
    }

    @Test
    void number4shouldReturn3() {
        assertThat(fibonacci.fib(4)).isEqualTo(3);
    }

    @Test
    void number15shouldReturn610() {
        assertThat(fibonacci.fib(15)).isEqualTo(610);
    }

    @Test
    void number8shouldReturn21() {
        assertThat(fibonacci.fib(8)).isEqualTo(21);
    }
}