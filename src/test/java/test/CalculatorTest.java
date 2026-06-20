package test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void testAddition() {
        Calculator calc = new Calculator();
        int result = calc.add(10, 20);
        System.out.println("result is "+result);
        assertEquals(30, result);//here we cant use Lambda as assertEquals looking for value not behaviour(method call)
    }
    
}
/*AAA pattern
 * Arrange :set up the objects variables and conditions needed for the test
 * Act:Invoke the specific method(behaviour)
 * Assert:compare the actual result with the expected result
 */
