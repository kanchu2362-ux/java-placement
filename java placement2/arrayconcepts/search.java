package java-placement.java placement2.arrayconcepts;

public import java.util.Scanner;

class SearchElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] a = new int[3][3];
        boolean found = false;

        System.out.println("Enter 9 elements:");

        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                a[i][j] = sc.nextInt();

        System.out.print("Enter element to search: ");
        int n = sc.nextInt();

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (a[i][j] == n) {
                    found = true;
                }
            }
        }

        if (found)
            System.out.println("Element found");
        else
            System.out.println("Element not found");
    }
} {
    
}
