package week_2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class maths {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double num1 = Double.parseDouble(reader.readLine());
        double num2 = Double.parseDouble(reader.readLine());
        double num3 = Double.parseDouble(reader.readLine());
        System.out.println("a + b = c ? - " + doubleExpression(num1, num2,num3));
    }

    public static boolean doubleExpression(double a, double b, double c) {
        return Math.abs((a+b)-c)<1e-4;
    }
}
