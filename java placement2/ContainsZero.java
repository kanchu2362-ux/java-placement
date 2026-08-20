public class ContainsZero {
    public static void main(String[] args) {
        int n = 12045;
        boolean found = false;

        while (n > 0) {
            int digit = n % 10;

            if (digit == 0) {
                found = true;
                break;
            }

            n = n / 10;
        }

        if (found)
            System.out.println("Number contains 0");
        else
            System.out.println("Number does not contain 0");
    }
}
