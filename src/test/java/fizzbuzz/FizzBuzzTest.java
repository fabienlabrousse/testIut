package fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FizzBuzzTest {

    @Test
    public void result_should_return_1_when_given_1() throws Exception {
        FizzBuzzBuilder fizzBuzzBuilder = new FizzBuzzBuilder();
        fizzBuzzBuilder.setA("null");
        FizzBuzz fizzBuzz = fizzBuzzBuilder.build();
        String result = fizzBuzz.result(1, "");
        String expected = "1";
        assertThat(result).isEqualTo(expected);
    }
}
