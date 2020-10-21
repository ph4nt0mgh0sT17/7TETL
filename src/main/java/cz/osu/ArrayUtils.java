package cz.osu;

import cz.osu.exception.ArrayEmptyException;

import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.stream.IntStream;

public class ArrayUtils {

    /**
     * Gets mean of the <code>data</code> array.
     * If data is null, {@link NullPointerException} is thrown.
     * If data has no values, {@link ArrayEmptyException} is thrown.
     *
     * @param data The array of {@link Integer} values.
     * @return The double sum.
     */
    public static double getMean(int[] data) {
        validateArray(data);

        return Arrays.stream(data)
                .average()
                .orElseThrow();
    }

    /**
     * Validates that the array is not null or empty.
     * If array is null, {@link NullPointerException} is thrown.
     * If array is empty, {@link ArrayEmptyException} is thrown.
     *
     * @param array The array that is being checked.
     */
    private static void validateArray(int[] array) {
        if (array == null) {
            throw new NullPointerException("Supplied parameter cannot be null.");
        }

        if (array.length == 0) {
            throw new ArrayEmptyException("The array is empty. Calculation cannot be done.");
        }
    }

    /**
     * Gets mean of the <code>data</code> array.
     * If data is null, {@link NullPointerException} is thrown.
     * If data has no values, {@link ArrayEmptyException} is thrown.
     *
     * @param data The array of {@link Integer} values.
     * @return The double sum.
     */
    public static double getMean(double[] data) {
        validateArray(data);

        return Arrays.stream(data)
                .average()
                .orElseThrow();
    }

    /**
     * Validates that the array is not null or empty.
     * If array is null, {@link NullPointerException} is thrown.
     * If array is empty, {@link ArrayEmptyException} is thrown.
     *
     * @param array The array that is being checked.
     */
    private static void validateArray(double[] array) {
        if (array == null) {
            throw new NullPointerException("Supplied parameter cannot be null.");
        }

        if (array.length == 0) {
            throw new ArrayEmptyException("The array is empty. Calculation cannot be done.");
        }
    }

    /**
     * Calculates the standard deviation from {@link Integer} <code>data</code> array.
     *
     * <p>
     *      If array is null, {@link NullPointerException} is thrown.
     *      If array is empty, {@link ArrayEmptyException} is thrown.
     * </p>
     *
     * @param data The array of integer values as the source of calculation.
     * @return The double result of standard deviation calculation.
     */
    public static double getStandardDeviation(int[] data) {
        validateArray(data);

        double dataMean = getMean(data);

        double sum = Arrays.stream(data)
                .mapToDouble(currentNumber -> Math.pow((currentNumber - dataMean), 2))
                .sum();

        double dispersion = (1D / (data.length - 1)) * sum;

        return Math.sqrt(dispersion);
    }

    /**
     * Calculates the standard deviation from {@link Double} <code>data</code> array.
     *
     * <p>
     *      If array is null, {@link NullPointerException} is thrown.
     *      If array is empty, {@link ArrayEmptyException} is thrown.
     * </p>
     *
     * @param data The array of double values as the source of calculation.
     * @return The double result of standard deviation calculation.
     */
    public static double getStandardDeviation(double[] data) {
        validateArray(data);

        double dataMean = getMean(data);

        double sum = Arrays.stream(data)
                .map(currentNumber -> Math.pow((currentNumber - dataMean), 2))
                .sum();

        double dispersion = (1D / (data.length - 1)) * sum;

        return Math.sqrt(dispersion);
    }
}
