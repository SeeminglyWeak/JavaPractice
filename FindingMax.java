import java.util.Scanner;

public class FindingMax {
    public static void main(String[] args) {
        //Finding the maximum element in the array
        Scanner sc = new Scanner(System.in);
        System.out.print("How many numbers to compare: ");
        int size = sc.nextInt();
        int[] num = new int[size];
        for (int i = 0; i < num.length; i++) {
            System.out.print("Enter number " + (i + 1) + " : ");
            num[i] = sc.nextInt();
        }
        int max = num[0];
        for (int i = 1; i < num.length; i++) {
            if (num[i] > max) {
                max = num[i];  // update if current is greater
            }
        }

        System.out.println("The greatest number is: " + max);
    }
}