import java.util.Scanner;
//calculating square and cube using static method
public class Mathtool {
    static int square(int a){
        int b  = a*a;
        return b;
    }
    static int cube(int d){
        int c = d*d*d;
        return c;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number you want the square or cube of: ");
        int num = sc.nextInt();
        System.out.println("Do you want square or cube of the entered number?");
        String choice = sc.next();
        if (choice.equalsIgnoreCase("square")){
            System.out.println(Mathtool.square(num));
        } else if (choice.equalsIgnoreCase("cube")) {
            System.out.println(Mathtool.cube(num));
        } else {
            System.out.println("This program is only designed to calculate square or cube of a number.");
        }
    }
}