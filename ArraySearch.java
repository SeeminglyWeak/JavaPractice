//Given an array, arr[] of n integers, and an integer element x, find whether element x is present in the array.
//Return the index of the first occurrence of x in the array, or -1 if it doesn't exist.

import java.util.Scanner;

class duplicate1{
    public int solution(int x,int [] arr){
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == x) {
                    return i; // return the first index where x is found
                }
            }
            return -1; // if not found
        }
    }
public class ArraySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
        System.out.println("How many numbers to check?");
        size = sc.nextInt();
        System.out.println("Enter the numbers in the array:");
        int [] arr1 = new int[size];
        for (int i =0; i < size; i++){
            System.out.println("The number " + (i+1) + " is?");
            arr1[i] = sc.nextInt();
        }
        System.out.println("Which number to check in the array is present?");
        int check = sc.nextInt();

        duplicate1 sol = new duplicate1();
        System.out.println(sol.solution(check,arr1));
    }
}
