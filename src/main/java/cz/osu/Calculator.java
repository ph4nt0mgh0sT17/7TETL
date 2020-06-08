package cz.osu;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Calculator {

    private static final Logger logger = LoggerFactory.getLogger(App.class);

    public int add(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public int divide(int firstNumber, int secondNumber) {

        try {
            return firstNumber / secondNumber;
        }

        catch (ArithmeticException ex) {
            logger.error("Division by zero.", ex);
            ex.printStackTrace();

            throw ex;
        }
    }
}
