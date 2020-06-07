package cz.osu;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {


    private static final Logger logger = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {

        logger.info("The program has started.");

        System.out.println("Hello, world!");

        logger.info("The program has ended.");
    }

    public static String getName(String name) {
        return name;
    }
}
