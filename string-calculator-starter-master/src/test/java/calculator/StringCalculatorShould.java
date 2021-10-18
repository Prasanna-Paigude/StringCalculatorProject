package calculator;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;

class StringCalculatorShould {
    @Test
    public void empty_string_should_return_0() {
    	StringCalculator stringCalculator = new StringCalculator();
        assertEquals(stringCalculator.add(""), 0);
    }

    @Test
    public void string_with_single_number_should_return_number_as_int() {
    	StringCalculator stringCalculator = new StringCalculator();
        assertEquals(stringCalculator.add("1"), 1);
    }
   
}
