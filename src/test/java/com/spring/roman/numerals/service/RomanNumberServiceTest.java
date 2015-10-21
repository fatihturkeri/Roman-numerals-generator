package com.spring.roman.numerals.service;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.mockito.InjectMocks;

/**
 *
 * @author fatih
 */
public class RomanNumberServiceTest {

    @InjectMocks
    private RomanNumberService service;

    @Test
    public void test_roman_numerals_service() {
        assertEquals(this.service.getRomanNumeral(1), "I");
        assertEquals(this.service.getRomanNumeral(2), "II");
        assertEquals(this.service.getRomanNumeral(3), "III");
        assertEquals(this.service.getRomanNumeral(17), "XVII");
        assertEquals(this.service.getRomanNumeral(44), "XLIV");
        assertEquals(this.service.getRomanNumeral(123), "CXXIII");
        assertEquals(this.service.getRomanNumeral(968), "CMLXVIII");
        assertEquals(this.service.getRomanNumeral(1923), "MCMXXIII");
        assertEquals(this.service.getRomanNumeral(1881), "MDCCCLXXXI");
        assertEquals(this.service.getRomanNumeral(3999), "MMMCMXCIX");
    }
}
