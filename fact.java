import java.util.Scanner;

public class fact {
    public static void main(String[] args) {
        int i, fact = 1, number;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        number = scanner.nextInt();
        for (i = 1; i <= number; i++) {
            fact = fact * i;
        }
        System.out.printf("Factorial of %d is: %d", number, fact);
    }
}

