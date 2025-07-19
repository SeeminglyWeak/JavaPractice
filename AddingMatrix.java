import java.util.Scanner;

public class AddingMatrix {
    public static void main(String[] args) {
        //Adding two matrices of 2*3 size
        Scanner sc = new Scanner(System.in);
        int[][] num1 = new int[2][3];
        int[][] num2 = new int[2][3];
        //Matrix value(First column)
        System.out.println("Entering value for first matrix:-");
        for (int i = 0; i < num1.length; i++) {
            for (int q = 0; q < num1[i].length; q++) {
                System.out.print("Enter a matrix value: ");
                num1[i][q] = sc.nextInt();
            }
        }
        //Matrix value(Second column)
        System.out.println("Entering value for second matrix:-");
        for (int i = 0; i < num2.length; i++) {
            for (int q = 0; q < num2[i].length; q++) {
                System.out.print("Enter a matrix value: ");
                num2[i][q] = sc.nextInt();
            }
        }
        //Adding the matrices
        int[][] num3 = new int[2][3];
        for (int i = 0; i < num3.length; i++) {
            for (int q = 0; q < num3[i].length; q++) {
                num3[i][q]= num1[i][q] + num2[i][q];
            }
        }
        //Display Result
        System.out.println("Adding Matrix 1 and Matrix 2 :");
        for (int i = 0; i < num3.length; i++) {
            for (int q = 0; q < num3[i].length; q++) {
                System.out.print(num3[i][q]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}