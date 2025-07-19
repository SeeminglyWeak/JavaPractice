import java.util.Scanner;

public class MultiplicationTable {
    static void table(int num) {
        for (int i = 1; i <=10 ; i++){
            System.out.println(num + " multiplied to " + i + " is " + num*i);
        }
    }
    public static void main(String[] args) {
        //Writing the multiplication table of number n
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number you want the multiplication table of - ");
        int num = sc.nextInt();
        table(num);
    }
}
