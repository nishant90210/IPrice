import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UpperCaseTest{

    private final UpperCase upperCase = new UpperCase();

    @Test
    public void testNullStringUpperCase() {

        String response = upperCase.applyOperation("");
        assertEquals("", response);
    }

    @Test
    public void testStringUpperCase() {

        String response = upperCase.applyOperation("iprice");
        assertEquals("IPRICE", response);
    }
}
