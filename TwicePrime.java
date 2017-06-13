package ke.george.news.aggregation;

/**
 * A java class that generates twice prime numbers e.g 11,13,17,23,31,37,53,71,73
 * A twice prime number is defined as a prime number whose digits are also prime
 *
 * @author george
 */
class TwicePrime {
    public static void main(String[] args) {
        for (int x = 0; x < 100; x++) {
            if (isPrime(x) && isTwicePrime(x) && String.valueOf(x).length() > 1) {
                System.out.println(x); // sample output: 11,13,17,23,31,37,53,71,73
            }
        }
    }

    /**
     * Checks if an integer is a prime number
     *
     * @return boolean
     */
    public static boolean isPrime(int number) {
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    /**
     * Checks if the digits of a number are also prime
     *
     * @return boolean
     */
    private static boolean isTwicePrime(int number) {
        String digits = String.valueOf(number);
        for (int j = 0; j < digits.length(); j++) {
            int digit = Character.digit(digits.charAt(j), 10);
            if (digit != number && !isPrime(digit)) {
                return false;
            }

        }

        return true;
    }
}