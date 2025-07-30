import java.util.Scanner;

class missing{
    int missingnumber(int [] arr,int n) {
        int ExpectedSum = (n * (n + 1)) / 2;
        int ActualSum = 0;
        for (int i = 0; i < arr.length; i++){
            ActualSum = ActualSum + arr[i];
        }
        return ExpectedSum - ActualSum;
    }
}

public class MissingInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many natural to check with?");
        int size = sc.nextInt();
        int [] myarr = new int[size];
        for (int i = 0; i < myarr.length - 1; i++){
            System.out.println("Enter the natural numbers :");
            myarr[i] = sc.nextInt();
        }
        missing result = new missing();
        System.out.println(result.missingnumber(myarr,size));
    }
}