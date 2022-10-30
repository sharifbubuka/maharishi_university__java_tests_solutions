import java.util.ArrayList;

public class PorcupineNumber {
    public static void main(String[] args) {
        System.out.println(String.format("First porcupine number greater than 138: %d", findPorcupineNumber(138))); // 139
        System.out.println(String.format("First porcupine number greater than 139: %d", findPorcupineNumber(139))); // 149
    }

    // returns true if input integer is prime, otherwise false
    private static boolean isPrime(int num) {
        boolean flag = true;
        for (int i = 2; i <= Math.ceil(num / 2); ++i) {
            if (num % i == 0) {
                flag = false;
                break;
            }
        }

        return flag;
    }

    // find the last digit of a number
    private static int lastDigit(int num) {
        return num % 10;
    }

    // find the first digit of a number
    // private static int firstDigit(int num) {
    //     // find total number of digits - 1
    //     int digits = (int)Math.log10(num);

    //     // find first digit
    //     int digit = (int) num / (int)Math.pow(10, digits);

    //     return digit;
    // }

    public static int findPorcupineNumber(int n) {
        ArrayList<Integer> porcupines = new ArrayList<>();
        
        for (int i = n + 1; porcupines.size() < 2; i++) {
            if (!isPrime(i)) continue;
            if (lastDigit(i) == 9) porcupines.add(i);
        }

        return porcupines.get(0);
    }
}
