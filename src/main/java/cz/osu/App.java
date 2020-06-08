package cz.osu;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

public class App {


    private static final Logger logger = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {

        logger.info("The program has started.");

        System.out.println("Hello, world!");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Type a first number: ");
        int firstNumber = scanner.nextInt();

        System.out.print("Type a second number: ");
        int secondNumber = scanner.nextInt();

        Calculator calc = new Calculator();

        System.out.println(String.format("%d / %d = %d",firstNumber, secondNumber, calc.divide(firstNumber, secondNumber)));

        logger.info("The program has ended.");
    }

    public static String getName(String name) {
        return name;
    }
}
