import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Grinyov Vitaliy on 25.06.15.
 */
public class CalculatorTest {

    @Test
    public void testAdd() throws Exception {

        Calculator calculator = new Calculator();
        calculator.add(1, 1);
        assertEquals(2, calculator.getResult());

    }

    @Test
    public void testDiv() throws Exception {

        Calculator calculator = new Calculator();
        calculator.div(1, 1);
        assertEquals(0, calculator.getResult());

    }
}