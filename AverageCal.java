import java.util.Scanner;

public class AverageCal {
    public static int average(int limit){
        Scanner sc = new Scanner(System.in);
        int [] list = new int[limit];
        for (int i = 0; i < list.length; i++){
            System.out.println("Enter the " + (i+1) + " number : " );
            list[i] = sc.nextInt();
        }
        int sum = 0;
        for (int x = 0; x< list.length; x++){
            sum += list[x];
        }
        return sum/limit;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many numbers you want to find the average of?");
        int size = sc.nextInt();
        int result = average(size);
        System.out.println("The average of the given number is : " + result);
    }
}
