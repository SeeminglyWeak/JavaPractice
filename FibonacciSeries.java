import java.util.Scanner;

public class FibonacciSeries {

    // Static method to print Fibonacci numbers up to the given limit
    static void printFibonacci(int limit) {
        int a = 0, b = 1;

        System.out.println("Fibonacci series up to " + limit + ":");

        while (a <= limit) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println();  // for newline
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive integer limit: ");
        int limit = sc.nextInt();

        if (limit < 0) {
            System.out.println("Limit should be a non-negative number.");
        } else {
            printFibonacci(limit);
        }
    }
}
