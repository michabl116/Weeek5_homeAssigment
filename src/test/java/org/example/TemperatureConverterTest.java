package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TemperatureConverterTest {

    TemperatureConverter converter = new TemperatureConverter();

    @Test
    public void testFahrenheitToCelsius() {
        double result = converter.fahrenheitToCelsius(98.6);
        assertEquals(37.0, result, 0.01);
    }

    @Test
    public void testCelsiusToFahrenheit() {
        double result = converter.celsiusToFahrenheit(0.0);
        assertEquals(32.0, result, 0.01);
    }

    @Test
    public void testKelvinToCelsius() {
        double result = converter.kelvinToCelsius(300.0);
        assertEquals(26.85, result, 0.01);
    }

    @Test
    public void testIsExtremeTemperatureTrueLow() {
        assertTrue(converter.isExtremeTemperature(-45.0));
    }

    @Test
    public void testIsExtremeTemperatureTrueHigh() {
        assertTrue(converter.isExtremeTemperature(55.0));
    }

    @Test
    public void testIsExtremeTemperatureFalse() {
        assertFalse(converter.isExtremeTemperature(25.0));
    }
}