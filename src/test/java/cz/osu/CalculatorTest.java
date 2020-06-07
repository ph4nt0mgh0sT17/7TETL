package cz.osu;

import org.junit.Test;

public class CalculatorTest {

    @Test
    public void testAddition() {
        int firstNumber = 15;
        int secondNumber = 15;

        assert new Calculator().add(firstNumber, secondNumber) == 30;
    }
}
