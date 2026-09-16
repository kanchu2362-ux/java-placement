package java-placement.java placement2.arrayconcepts;

public import java.util.Scanner;

class CountOccurrence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] a = new int[3][3];
        int count = 0;

        System.out.println("Enter 9 elements:");

        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                a[i][j] = sc.nextInt();

        System.out.print("Enter number: ");
        int n = sc.nextInt();

        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                if (a[i][j] == n)
                    count++;

        System.out.println("Occurrence = " + count);
    }
} {
    
}
