package cz.osu;

import org.junit.Test;

public class AppTest {

    @Test
    public void testEqualsName() {
        String name = "David";

        assert name.equals(App.getName(name));
    }

    @Test
    public void testNotEqualsName() {
        String name = "David";

        assert !name.equals(App.getName("Davidi"));
    }
}
