package com.spring.roman.numerals.service;

import java.util.LinkedHashMap;
import java.util.Map;
import org.springframework.stereotype.Service;

/**
 *
 * @author fatih
 */
@Service
public class RomanNumberService {

    public static String getRomanNumeral(int number) {

        if (number > 0 && number < 4000) {

            final LinkedHashMap<Integer, String> numberLimits
                    = new LinkedHashMap<>();

            numberLimits.put(1, "I");
            numberLimits.put(4, "IV");
            numberLimits.put(5, "V");
            numberLimits.put(9, "IX");
            numberLimits.put(10, "X");
            numberLimits.put(40, "XL");
            numberLimits.put(50, "L");
            numberLimits.put(90, "XC");
            numberLimits.put(100, "C");
            numberLimits.put(400, "CD");
            numberLimits.put(500, "D");
            numberLimits.put(900, "CM");
            numberLimits.put(1000, "M");

            String romanNumeral = "";

            while (number > 0) {
                int highestFound = 0;
                for (Map.Entry<Integer, String> current : numberLimits.entrySet()) {
                    if (current.getKey() <= number) {
                        highestFound = current.getKey();
                    }
                }
                romanNumeral += numberLimits.get(highestFound);
                number -= highestFound;
            }
            return romanNumeral;

        } else {
            throw new UnsupportedOperationException(number
                    + " is not a valid Roman numeral.");
        }
    }
}
