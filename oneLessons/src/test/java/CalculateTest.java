import org.junit.jupiter.api.Test;
import su.gild.Calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculateTest {

    @Test
    public void testPlus() {
        Calculator calculator = new Calculator();
        int result = calculator.plus(2, 3);
        assertEquals(5, result);
    }

    @Test
    public void testMinus() {
        Calculator calculator = new Calculator();
        int result = calculator.minus(3, 2);
        assertEquals(1, result);
    }

    @Test
    public void testMulti() {
        Calculator calculator = new Calculator();
        int result = calculator.multi(2, 3);
        assertEquals(6, result);
    }
}
