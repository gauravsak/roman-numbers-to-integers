import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanNumberToIntegerConverterTest {

    @Test
    void convertsIto1() {
        assertEquals(1, new RomanNumberToIntegerConverter().convert("I"));
    }
}
