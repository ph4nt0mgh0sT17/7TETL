package cz.osu;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {


    private static final Logger logger = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {

        logger.info("The program has started.");

        System.out.println(calculateFibonacciSequence(250));

        logger.info("The program has ended.");
    }

    public static long calculateFibonacciSequence(int n) {

        assert n >= 0 : "The Fibonacci sequence can be calculated only for numbers bigger or equal to 0.";

        long[] fibonacciSequence = new long[n+2];

        // Known values in fibonacci sequence
        fibonacciSequence[0] = 0;
        fibonacciSequence[1] = 1;

        for (int i = 2; i <= n; i++)
        {
            fibonacciSequence[i] = fibonacciSequence[i-1] + fibonacciSequence[i-2];
        }

        assert fibonacciSequence[n] >= 0: "The Fibonacci sequence overflowed the long number.";

        return fibonacciSequence[n];
    }
}
