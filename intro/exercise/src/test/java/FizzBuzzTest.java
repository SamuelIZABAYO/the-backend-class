import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.assertj.core.data.Percentage;
import org.junit.jupiter.api.Test;

class FizzBuzzTest {

    FizzBuzz subjectUnderTest = new FizzBuzz();

    @Test
    void shouldReturn1() {
        String result = subjectUnderTest.calculate(1);
        assertThat(result).isEqualTo("1");
    }


    @Test
    void shouldReturn2() {
        String result = subjectUnderTest.calculate(2);
        assertThat(result).isEqualTo("2");
    }


    @Test
    void number3shouldReturnFizz() {
        String result = subjectUnderTest.calculate(3);
        assertThat(result).isEqualTo("fizz");
    }


    @Test
    void number9shouldReturnFizz() {
        String result = subjectUnderTest.calculate(9);
        assertThat(result).isEqualTo("fizz");
    }


    @Test
    void shouldReturn4() {
        String result = subjectUnderTest.calculate(4);
        assertThat(result).isEqualTo("4");
    }


    @Test
    void number5shouldReturnBuzz() {
        String result = subjectUnderTest.calculate(5);
        assertThat(result).isEqualTo("buzz");
    }

    @Test
    void number10shouldReturnBuzz() {
        String result = subjectUnderTest.calculate(10);
        assertThat(result).isEqualTo("buzz");
    }


    @Test
    void number15shouldReturnFizzBuzz() {
        String result = subjectUnderTest.calculate(15);
        assertThat(result).isEqualTo("fizzbuzz");
    }
}
