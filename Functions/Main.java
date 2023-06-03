package Functions;

public class Main {
    public static void main(String[] args) {
        printPrimeInRange1(10);

    }

    public static int fact(int num) {
        int result = 1;
        for (int i = 2; i <= num; i++) {
            result *= i;
        }
        return result;
    }

    public static float binomialCoefficient(int n, int r) {

        int nFact = fact(n);
        int rFact = fact(r);
        int nMinusRFact = fact(n - r);
        float binomialCoefficient = nFact / (rFact * (nMinusRFact));

        return binomialCoefficient;
    }

    public static boolean checkIfPrime(int num) {
        for (int i = 2; i < num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * Checks if a given number is prime.
     *
     * @param num The number to be checked. Must be a positive integer.
     * @return true if the number is prime, false otherwise.
     */
    public static boolean isPrime(int num) {
        // Check if the number is less than 2
        // Prime numbers start from 2
        if (num < 2) {
            return false;
        }

        // Special case: 2 is a prime number
        if (num == 2) {
            return true;
        }

        // Check if the number is even
        // All even numbers greater than 2 are not prime
        if (num % 2 == 0) {
            return false;
        }

        // Iterate from 3 up to the square root of the number
        // Increment by 2 to skip even numbers, as they are already checked
        for (int i = 3; i <= Math.sqrt(num); i += 2) {
            // Check if the number is divisible by the current iteration
            if (num % i == 0) {
                return false;
            }
        }

        // The number is prime
        return true;
    }

    /**
     * Prints prime numbers within the specified range.
     *
     * @param upperLimit The upper limit of the range (exclusive). Must be a
     *                   positive number.
     */
    public static void printPrimeNumbersInRange(int upperLimit) {
        if (upperLimit < 2) {
            return;
        }

        if (upperLimit >= 2) {
            System.out.println(2);
        }

        for (int number = 3; number < upperLimit; number += 2) {
            if (isPrime(number)) {
                System.out.print(number + ", ");
            }
        }
    }

    public static void printPrimeInRange1(int num) {
        if (num < 2) {
            return;
        }

        StringBuilder result = new StringBuilder();

        if (num >= 2) {
            result.append(2);
        }

        for (int i = 3; i < num; i += 2) {
            if (checkIfPrime(i)) {
                result.append(", ").append(i);
            }
        }

        System.out.println(result);
    }

}
