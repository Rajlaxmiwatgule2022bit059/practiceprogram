import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[20];
        int n, sumeven = 0, sumodd = 0;

        System.out.print("size: ");
        n = scanner.nextInt();

        System.out.print(" ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                sumeven += arr[i];
            } else {
                sumodd += arr[i];
            }
        }

        System.out.println("Sum of even numbers is " + sumeven);
        System.out.println("Sum of odd numbers is " + sumodd);
        scanner.close();
    }
}


