import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class IntsCalculatorTests {
    public static Ints calculator;

    @BeforeAll
    public static void init() {
        calculator = new IntsCalculator();
    }

    @Test
    public void testBySum() {
        int arg0 = 2, arg1 = 3, expected = 5;

        int result = calculator.sum(arg0, arg1);

        Assertions.assertEquals(result, expected);
    }

        @Test
    public void testByMult() {
        int arg0 = 2, arg1 = 3, expected = 6;

        int result = calculator.mult(arg0, arg1);

        Assertions.assertEquals(result, expected);
    }

            @Test
    public void testByPow() {
        int arg0 = 2, arg1 = 3, expected = 8;

        int result = calculator.pow(arg0, arg1);

        Assertions.assertEquals(result, expected);
    }
}
