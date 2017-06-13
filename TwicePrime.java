class TwicePrime {
    public static void main(String[] args) {
        int number = 23;

        if (isPrime(number)) {
            System.out.println(number + " number is prime");
        } else {
            System.out.println(number + " number NOT prime");
        }
    }

    /**
     * Checks is a positive integer is a prime number
     */
    public static boolean isPrime(int number) {
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }

            String digits = String.valueOf(number);
            for (int j = 0; j < digits.length(); j++) {
                int digit = Character.digit(digits.charAt(j), 10);
                System.out.println("digit: " + digit);
                if (!isPrime(digit)) {
                    return false;
                }
            }
        }

        return true;
    }
}

