package week_2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class leap_year {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int y = Integer.parseInt(reader.readLine());
            System.out.println("Quantity of leap year's is: " + leapYearCount(y));
    }
    public static int leapYearCount(int year) {
        return year/4 - year/100 + year/400;
    }





}
