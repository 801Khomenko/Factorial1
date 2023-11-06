import org.example.Factorial;
import org.junit.Test;

import static org.junit.Assert.*;

public class FactorialTest {
    Factorial factorial = new Factorial();
    @Test
    public void CoolFactorialTest() {
        long expected = 720;
        long actual = factorial.calculateFactorial(6);
        assertEquals(actual, expected);
    }
    @Test
    public void BadFactorialTest() {
        long expected = 41;
        long actual = factorial.calculateFactorial(6);
        assertNotEquals(actual, expected);
    }


    @Test
    public void CoolFactorialTest1() {
        long expected = 479001600;
        long actual = factorial.calculateFactorial(12);
        assertEquals(actual, expected);
    }
    @Test
    public void BadFactorialTest1() {
        long expected = 7654;
        long actual = factorial.calculateFactorial(12);
        assertNotEquals(actual, expected);
    }


    @Test
    public void CoolFactorialTest2() {
        long expected = 5040;
        long actual = factorial.calculateFactorial(7);
        assertEquals(actual, expected);
    }
    @Test
    public void BadFactorialTest2() {
        long expected = 2;
        long actual = factorial.calculateFactorial(7);
        assertNotEquals(actual, expected);
    }

    @Test
    public void NegativeNumberTest1() {
        RuntimeException exception = assertThrows(RuntimeException.class, () -> factorial.calculateFactorial(-7));
        assertEquals(exception.getMessage(), "Negative number - -7");
    }

    @Test
    public void NegativeNumberTest2() {
        RuntimeException exception = assertThrows(RuntimeException.class, () -> factorial.calculateFactorial(-32));
        assertEquals(exception.getMessage(), "Negative number - -32");
    }
}
