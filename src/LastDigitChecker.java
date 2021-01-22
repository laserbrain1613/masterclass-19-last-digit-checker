public class LastDigitChecker {

    public static boolean hasSameLastDigit(int value1, int value2, int value3) {
        if (isValid(value1) && isValid(value2) && isValid(value3)) {
            return value1 % 10 == value2 % 10 ||
                    value1 % 10 == value3 % 10 ||
                    value2 % 10 == value3 % 10;
        } else {
            return false;
        }
    }

    public static boolean isValid(int value) {
        return (value >= 10 && value <= 1000);
    }
}