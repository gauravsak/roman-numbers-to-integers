public class RomanNumberToIntegerConverter {
    public int convert(String romanNumber) {
        int integer = valueOf(romanNumber.charAt(romanNumber.length() - 1));
        for (int i = romanNumber.length() - 1; i > 0; i--) {
            int valueCurr = valueOf(romanNumber.charAt(i));
            int valuePrev = valueOf(romanNumber.charAt(i - 1));
            if (valueCurr > valuePrev)
                integer -= valuePrev;
            else
                integer += valuePrev;
        }
        return integer;
    }

    private int valueOf(char romanLiteral) {
        switch (romanLiteral) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
        }
        return 0;
    }
}
