package cz.osu;

import java.util.Arrays;

public class DoubleArrayUtils {

    public static double sum(double[] data) {
        return Arrays.stream(data).sum();
    }

    public static double[] addScalar(double[] data, int value) {
        return Arrays.stream(data)
                .map(currentNumber -> currentNumber + value)
                .toArray();
    }
}
