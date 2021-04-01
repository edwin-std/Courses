package week_2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;
import java.lang.*;

//factorial task

public class factorial_test {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
         int num = Integer.parseInt(reader.readLine());
            System.out.println("factorial is : " + factorial(num));
    }

    public static BigInteger factorial(int value) {
        BigInteger result = BigInteger.ONE;
            for (int i = 1; i <= value; i++)
                result = result.multiply(BigInteger.valueOf(i));
            return result;
    }
}
