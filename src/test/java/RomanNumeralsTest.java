import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RomanNumeralsTest {
    RomanNumerals romanNumerals = new RomanNumerals();

    @Test
    public void toRoman() {
        String roman = romanNumerals.integerToRoman(2000);
        assertEquals(roman, "MM");
    }

    @Test
    public void toInteger() {
        int number = romanNumerals.romanToInteger("MM");
        assertEquals(number, 2000);
    }

    @Test
    public void summation() {
        int sum = romanNumerals.romanToInteger("MM") + romanNumerals.romanToInteger("MM");
        assertEquals(sum, 4000);
    }

    @Test
    public void difference() {
        int diff = romanNumerals.romanToInteger("MMM") - romanNumerals.romanToInteger("M");
        assertEquals(diff, 2000);
    }

    @Test
    public void product() {
        int pro = romanNumerals.romanToInteger("X") * romanNumerals.romanToInteger("X");
        assertEquals(pro, 100);
    }

}
