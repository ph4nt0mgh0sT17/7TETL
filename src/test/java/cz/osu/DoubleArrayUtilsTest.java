package cz.osu;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DoubleArrayUtilsTest {

    @Test
    void sumDouble() {
        double[] data = {1, 2, 3, 4, 5};

        double expectedValue = 15;
        double actualValue = DoubleArrayUtils.sum(data);

        assertEquals(expectedValue, actualValue);
    }

    @Test
    void addScalar() {
        double[] data = {1, 2, 3, 4, 5};

        int value = 5;
        double[] dataAdded = DoubleArrayUtils.addScalar(data, value);

        assertNotNull(data);

        for (int i = 0; i < dataAdded.length; i++) {
            assertEquals(data[i] + 5, dataAdded[i]);
        }
    }
}