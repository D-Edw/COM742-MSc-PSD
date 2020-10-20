package Lab9;

import junit.framework.TestCase;

public class FtoCTest3 extends TestCase {

    public void testCelsiusToFahrenheit() {

        FtoC test = new FtoC();

        assertEquals("Test conversion 1: ", 41.0, test.CelsiusToFahrenheit(5), 0.1);
        assertEquals("Test conversion 2: ", 41.0, test.CelsiusToFahrenheit(5), 0.1);
    }//celsiusToFahrenheit
    }