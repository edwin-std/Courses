package week_2;

public class char_UNICODE {
    public static void main(String[] args) {
        System.out.println(charExpression(29));
    }
    public static char charExpression(int a) {
        char charValue =  '\\';
        int sum = charValue + a;
        char res = (char) sum;
        return res;

    }
}
