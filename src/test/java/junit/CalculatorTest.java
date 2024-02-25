package junit;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void testAdd() {
        assertEquals(5, Calculator.add(2, 3), 0);
    }

    @Test
    public void testSubtract() {
        assertEquals(2, Calculator.subtract(5, 3), 0);
    }

    @Test
    public void testDivide() {
        assertEquals(2, Calculator.divide(6, 3), 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDivideByZero() {
        Calculator.divide(5, 0);
    }
}
