import java.util.Scanner;

public class PrimeChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer : ");
        int num = sc.nextInt();
        boolean isprime = true;
        for (int i = 2 ; i < num ; i++){
            if (num % i == 0) {
                isprime = false;
                break;
            }
        }
        if (isprime){
            System.out.println("The number entered by the user is prime.");
        }else {
            System.out.println("The number entered by the user is not prime.");
        }
    }
}
