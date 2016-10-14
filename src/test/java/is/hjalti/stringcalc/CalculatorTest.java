package is.hjalti.stringcalc;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void testEmptyString() {
        assertEquals(0, Calculator.add(""));
    }

    @Test
    public void testAdd() {
        assertEquals(5, Calculator.add("5"));
        assertEquals(3, Calculator.add("1,2"));
        assertEquals(15, Calculator.add("2,3,5,5"));
        assertEquals(500, Calculator.add("100,100,100,100,100"));
    }

}