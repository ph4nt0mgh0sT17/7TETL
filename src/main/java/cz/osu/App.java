package cz.osu;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

public class App {


    private static final Logger logger = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {

        logger.info("The program has started.");

        int a = 10;
        int b = 0;

        int c = a / b;

        logger.info("The program has ended.");
    }

    public static double calculateArithmeticMean(double[] data) {
        assert data != null : "The data are expected to not be null.";

        return Double.parseDouble(null);
    }

    private static int[] createIntersectionBetweenArrays(int[] a, int[] b) {

        assert a != null;
        assert a.length != 0;

        assert b != null;
        assert b.length != 0;

        int[] ret = null;

        int nextIndex = 0;

        
        Integer[] tmp = new Integer[Math.min(a.length, b.length)];

        assert tmp.length <= a.length && tmp.length <= b.length;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    tmp[nextIndex] = a[i];
                    nextIndex++;
                }
            }
        }
        
        for (int i = 0; i < tmp.length; i++) {
            if (tmp[i] == null) {
                ret = new int[i];
                break;
            }
        }

        if (ret == null)
            ret = new int[tmp.length];

        assert ret != null;

        for (int i = 0; i < ret.length; i++) {
            ret[i] = tmp[i];
        }

        return ret;
    }
}
