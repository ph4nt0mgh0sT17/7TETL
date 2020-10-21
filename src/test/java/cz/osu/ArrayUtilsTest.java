package cz.osu;

import cz.osu.exception.ArrayEmptyException;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class for testing all ArrayUtils methods.
 *
 * JUnit 5 used.
 */
class ArrayUtilsTest {

    /**
     * Tests that the {@link ArrayUtils#getMean(int[])} can be calculated from simple {@link Integer} array.
     */
    @Test
    void getMeanWithIntegerArray() {
        int data[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        double expectedMean = 5.5D;
        double actualMean = ArrayUtils.getMean(data);

        assertEquals(
                expectedMean, actualMean,
                0.1, String.format("The expected mean '%f' is not equal to actual mean '%f'.", expectedMean, actualMean)
        );
    }

    /**
     * Tests that the {@link ArrayUtils#getMean(int[])} with null value throws {@link NullPointerException}.
     */
    @Test
    void getMeanWithIntegerNullArray() {
        int[] data = null;

        assertThrows(NullPointerException.class, () -> {
            ArrayUtils.getMean(data);
        }, "The expected NullPointerException was not thrown.");
    }

    /**
     * Tests that the {@link ArrayUtils#getMean(int[])} with empty array throws {@link ArrayEmptyException}.
     */
    @Test
    void getMeanWithIntegerEmptyArray() {
        int[] data = {};

        assertThrows(ArrayEmptyException.class, () -> {
            ArrayUtils.getMean(data);
        }, "The expected NoSuchElementException was not thrown.");
    }

    /**
     * Tests that the {@link ArrayUtils#getMean(double[])} can be calculated from simple {@link Double} array.
     */
    @Test
    void getMeanWithDoubleArray() {
        double data[] = {1.5, 2.54, 3.98, 4.5, 5.3, 6.5, 7.43, 8.43, 9.54, 10.13};

        double expectedMean = 5.985D;
        double actualMean = ArrayUtils.getMean(data);

        assertEquals(
                expectedMean, actualMean,
                String.format("The expected mean '%f' is not equal to actual mean '%f'.", expectedMean, actualMean)
        );
    }

    /**
     * Tests that the {@link ArrayUtils#getMean(double[])} with null value throws {@link NullPointerException}.
     */
    @Test
    void getMeanWithDoubleNullArray() {
        double[] data = null;

        assertThrows(NullPointerException.class, () -> {
            ArrayUtils.getMean(data);
        }, "The expected NullPointerException was not thrown.");
    }

    /**
     * Tests that the {@link ArrayUtils#getMean(double[])} with empty array throws {@link ArrayEmptyException}.
     */
    @Test
    void getMeanWithDoubleEmptyArray() {
        double[] data = {};

        assertThrows(ArrayEmptyException.class, () -> {
            ArrayUtils.getMean(data);
        }, "The expected NoSuchElementException was not thrown.");
    }

    /**
     * Tests that the {@link ArrayUtils#getStandardDeviation(int[])} can be calculated from simple {@link Integer} array.
     */
    @Test
    void getStandardDeviationFromIntegerArray() {
        int data[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        double expectedMean = 3.027650354D;
        double actualMean = ArrayUtils.getStandardDeviation(data);

        assertEquals(
                expectedMean, actualMean,
                0.000000001, String.format("The expected standard deviation '%f' is not equal to actual standard deviation '%f'.", expectedMean, actualMean)
        );
    }

    /**
     * Tests that the {@link ArrayUtils#getStandardDeviation(int[])} with null value throws {@link NullPointerException}.
     */
    @Test
    void getStandardDeviationFromIntegerNullArray() {
        int data[] = null;

        assertThrows(NullPointerException.class, () -> {
            ArrayUtils.getStandardDeviation(data);
        }, "The expected NullPointerException was not thrown.");
    }

    /**
     * Tests that the {@link ArrayUtils#getStandardDeviation(int[])} with empty array throws {@link ArrayEmptyException}.
     */
    @Test
    void getStandardDeviationFromIntegerEmptyArray() {
        int data[] = {};

        assertThrows(ArrayEmptyException.class, () -> {
            ArrayUtils.getStandardDeviation(data);
        }, "The expected NoSuchElementException was not thrown.");
    }

    /**
     * Tests that the {@link ArrayUtils#getStandardDeviation(int[])} can be calculated from simple {@link Double} array.
     */
    @Test
    void getStandardDeviationFromDoubleArray() {
        double data[] = {1.5, 2.54, 3.98, 4.5, 5.3, 6.5, 7.43, 8.43, 9.54, 10.13};

        double expectedMean = 2.77178733D;
        double actualMean = ArrayUtils.getStandardDeviation(data);

        assertEquals(
                expectedMean, actualMean,
                0.2, String.format("The expected standard deviation '%f' is not equal to actual standard deviation '%f'.", expectedMean, actualMean)
        );
    }

    /**
     * Tests that the {@link ArrayUtils#getStandardDeviation(double[])} with null value throws {@link NullPointerException}.
     */
    @Test
    void getStandardDeviationFromDoubleNullArray() {
        double data[] = null;

        assertThrows(NullPointerException.class, () -> {
            ArrayUtils.getStandardDeviation(data);
        }, "The expected NullPointerException was not thrown.");
    }

    /**
     * Tests that the {@link ArrayUtils#getStandardDeviation(double[])} with empty array throws {@link ArrayEmptyException}.
     */
    @Test
    void getStandardDeviationFromDoubleEmptyArray() {
        double data[] = {};

        assertThrows(ArrayEmptyException.class, () -> {
            ArrayUtils.getStandardDeviation(data);
        }, "The expected NoSuchElementException was not thrown.");
    }
}