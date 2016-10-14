package is.hjalti.stringcalc;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void testEmptyString() {
        assertEquals(0, Calculator.add(""));
    }

    @Test
    public void testAddWithCommas() {
        assertEquals(5, Calculator.add("5"));
        assertEquals(3, Calculator.add("1,2"));
        assertEquals(15, Calculator.add("2,3,5,5"));
        assertEquals(500, Calculator.add("100,100,100,100,100"));
    }

    @Test
    public void testAddWithNewLine() {
        assertEquals(15, Calculator.add("10\n5"));
        assertEquals(10, Calculator.add("1\n2\n3\n4"));
    }

    @Test
    public void testAddWithBothDelimites() {
        assertEquals(15, Calculator.add("5\n5,5"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNegativeNumbers() {
        Calculator.add("11,-1");
        Calculator.add("20,-1,5\n9");
    }

}