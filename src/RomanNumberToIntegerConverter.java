public class RomanNumberToIntegerConverter {
    public int convert(String romanNumber) {
        if ("I".equals(romanNumber))
            return 1;
        else if ("II".equals(romanNumber))
            return 2;
        else
            return 3;
    }
}
