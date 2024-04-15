import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int r, c;
        int[][] a = new int[100][100];
        int[][] b = new int[100][100];
        int[][] sum = new int[100][100];

        System.out.print("rows: ");
        r = scanner.nextInt();
        System.out.print("columns:");
        c = scanner.nextInt();
        System.out.println("\n frist");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.printf(" ", i + 1, j + 1);
                a[i][j] = scanner.nextInt();
            }
        }
        System.out.println("second ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.printf("", i + 1, j + 1);
                b[i][j] = scanner.nextInt();
            }
        }
        // Adding two matrices
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                sum[i][j] = a[i][j] + b[i][j];
            }
        }
        // Printing the result
        System.out.println(" ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(sum[i][j] + "\t");
            }
            System.out.println();
        }
        scanner.close();
    }
}

