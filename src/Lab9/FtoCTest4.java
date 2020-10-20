package Lab9;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

class FtoCTest4 {

    @org.junit.jupiter.api.Test
    void celsiusToFahrenheit() {
        FtoC test = new FtoC();

        assertEquals("Test conversion 1: ", 41.0, test.CelsiusToFahrenheit(5), 0.1);
        assertEquals("Test conversion 2: ", 41.0, test.CelsiusToFahrenheit(5), 0.1);
    }//celsiusToFahrenheit
    }