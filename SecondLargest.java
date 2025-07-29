import java.util.Scanner;

//Given an array of positive integers arr[], return the second-largest element from the array.
class FindingMax1{
    int max(int [] arr){
        int max = 0;
        for (int i = 0; i < arr.length; i++){
            if (max < arr[i]){
                max = arr[i];
            }
        }
        //System.out.println("The largest number is : " + max);
        int [] arr1 = new int[arr.length];
        for (int k = 0; k < arr.length; k++){
            if (arr[k] == max ){
                arr1[k] = 1;
            } else if (arr[k]/max < 1) {
                arr1[k] = arr[k];
            }
        }
        int max1 = 0;
        for (int j = 0; j < arr1.length; j++){
            if (max1 < arr1[j]){
                max1 = arr1[j];
            }
        }
        //System.out.println("The second largest number is : " + max1);
        return max1;
    }
}
public class SecondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many numbers to compare: ");
        int size = sc.nextInt();
        int[] myarr = new int[size];
        for (int i = 0; i < myarr.length; i++) {
            System.out.print("Enter number " + (i + 1) + " : ");
            myarr[i] = sc.nextInt();
        }
        FindingMax1 num = new FindingMax1();
        System.out.println("The second largest number in the given array is : " + num.max(myarr));
    }
}