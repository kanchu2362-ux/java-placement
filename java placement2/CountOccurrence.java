public class CountOccurrence {
    public static void main(String[] args) {
        int n = 12232;
        int search = 2;
        int count = 0;

        while (n > 0) {
            int digit = n % 10;

            if (digit == search)
                count++;

            n = n / 10;
        }

        System.out.println("Occurrence = " + count);
    }
}