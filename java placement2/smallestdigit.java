
public class SmallestDigit {
    public static void main(String[] args) {
        int n = 58321;
        int min = 9;

        while (n > 0) {
            int digit = n % 10;

            if (digit < min)
                min = digit;

            n = n / 10;
        }

        System.out.println("Smallest Digit = " + min);
    }
}