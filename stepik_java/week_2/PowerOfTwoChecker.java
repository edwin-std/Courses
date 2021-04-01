package week_2;

public class PowerOfTwoChecker {
    public static void main(String[] args) {
        System.out.println("Is this num a power of two? " + isPowerOfTwo(2));//  <- Enter your num here
    }
    public static boolean isPowerOfTwo(int value) {
        value = Math.abs(value);
        return Integer.bitCount(value) == 1 ; // you implementation here
    }
}
