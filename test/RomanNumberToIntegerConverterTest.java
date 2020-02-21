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
    void convertsIto1() {
        assertEquals(1, romanNumberToIntegerConverter.convert("I"));
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
}
