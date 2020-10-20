package Lab9;

import org.junit.Test;

import static org.junit.Assert.*;

public class FtoCTest {

    @Test(timeout = 5000)
    public void celsiusToFahrenheit() {
        FtoC test = new FtoC();

        assertEquals("Test conversion 1: ", 41.0, test.CelsiusToFahrenheit(5), 0.1);
        assertEquals("Test conversion 2: ", 41.0, test.CelsiusToFahrenheit(5), 0.1);
    }//celsiusToFahrenheit
}//class