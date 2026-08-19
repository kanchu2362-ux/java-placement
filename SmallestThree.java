public class SmallestThree {
    public static void main(String[] args) {
        int a = 10, b = 30, c = 5;

        if (a <= b && a <= c)
            System.out.println(a + " is smallest");
        else if (b <= a && b <= c)
            System.out.println(b + " is smallest");
        else
            System.out.println(c + " is smallest");
    }
}
