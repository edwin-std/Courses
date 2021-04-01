package week_2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class isPalindrom {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String text = reader.readLine();
            String text1 = text.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
            String text2 = new StringBuilder(text1).reverse().toString();
            boolean result = text1.equals(text2);

            System.out.println(result);
        }
    }