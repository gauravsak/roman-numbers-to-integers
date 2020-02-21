import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanNumberToIntegerConverterTest {

    private RomanNumberToIntegerConverter romanNumberToIntegerConverter;

    @BeforeEach
    void setUp() {
        romanNumberToIntegerConverter = new RomanNumberToIntegerConverter();
    }

    @Test
    void convertsAllSingleLiteralRomanNumbersToIntegers() {
        assertEquals(1, romanNumberToIntegerConverter.convert("I"));
        assertEquals(5, romanNumberToIntegerConverter.convert("V"));
        assertEquals(10, romanNumberToIntegerConverter.convert("X"));
        assertEquals(50, romanNumberToIntegerConverter.convert("L"));
        assertEquals(100, romanNumberToIntegerConverter.convert("C"));
        assertEquals(500, romanNumberToIntegerConverter.convert("D"));
        assertEquals(1000, romanNumberToIntegerConverter.convert("M"));
    }

    @Test
    void convertsIIto2() {
        assertEquals(2, romanNumberToIntegerConverter.convert("II"));
    }

    @Test
    void convertsIIIto3() {
        assertEquals(3, romanNumberToIntegerConverter.convert("III"));
    }

    @Test
    void convertsIVto4() {
        assertEquals(4, romanNumberToIntegerConverter.convert("IV"));
    }

    @Test
    void convertsVto5() {
        assertEquals(5, romanNumberToIntegerConverter.convert("V"));
    }

    @Test
    void convertsVIto6() {
        assertEquals(6, romanNumberToIntegerConverter.convert("VI"));
    }

    @Test
    void convertsVIIto7() {
        assertEquals(7, romanNumberToIntegerConverter.convert("VII"));
    }

    @Test
    void convertsVIIIto8() {
        assertEquals(8, romanNumberToIntegerConverter.convert("VIII"));
    }

    @Test
    void convertsIXto9() {
        assertEquals(9, romanNumberToIntegerConverter.convert("IX"));
    }
}
