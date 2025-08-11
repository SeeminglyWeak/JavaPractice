//Find the first non-repeating element in a given array arr of integers.
//Note: The array consists of only positive and negative integers and not zero.

class Solution2{
    public int firstNonRepeating(int[] arr) {
        int sol = 0;
        for (int i = 0; i < arr.length; i++) {
            boolean duplicate = false;
            for (int j = 0; j < arr.length; j++) {
                if (i == j) {
                    continue;
                }
                if (arr[i] == arr[j]) {
                    duplicate = true;
                    break;
                }
            }
            if (!duplicate){
                return arr[i];
            }
        }
        return 0;
    }
}

public class NonRepeating {
    public static void main(String[] args) {
        int [] myarr = {-1, 2, -1, 3, 2};
        Solution2 result = new Solution2();
        System.out.println(result.firstNonRepeating(myarr));
    }
}