public class main{
    public static void main(String args[]){
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}




* 
* * 
* * * 
* * * * 
* * * * * 



    public class main{
    public static void main(String args[]){
        int n=8;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}




               *
             * *
           * * *
         * * * *
       * * * * *
     * * * * * *
   * * * * * * *
 * * * * * * * *

public class main{
    public static void main(String args[]){
        int n=8;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(" "+j);
            }
            System.out.println();
        }
    }
}



               1
             1 2
           1 2 3
         1 2 3 4
       1 2 3 4 5
     1 2 3 4 5 6
   1 2 3 4 5 6 7
 1 2 3 4 5 6 7 8



public class main{
    public static void main(String args[]){
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}



1 
1 2 
1 2 3 
1 2 3 4 
1 2 3 4 5 
                   
import java.util.*;

public class Main {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            // spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // stars
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("*");
            }

            // next line
            System.out.println();
        }
    }
}

5//i/p
    *
   ***
  *****
 *******
*********







    import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            // print spaces
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }

            // print stars
            for (int j = 1; j <= (2 * n - 1 - (i - 1) * 2); j++) {
                System.out.print("*");
            }

            // move to next line
            System.out.println();
        }
    }
}




4
*******
 *****
  ***
   *








    You are given a number n. You need to generate and print a pattern based on the given value of n.

For each row, starting from the first, print numbers in descending order from n down to 1.
Each number in a row is repeated as many times as the current row index (starting from n).
Instead of printing each row on a new line, separate rows with -1.
Instead of a newline at the end of each row, print -1 to indicate row separation. After printing the entire pattern, end the output with -1.

For n= 3,
pattern:  3 3 3 2 2 2 1 1 1
                    3 3 2 2 1 1 
                    3 2 1


Input: 2
Output: [2, 2, 1, 1, -1, 2, 1, -1]
Input: 3
Output: [3, 3, 3, 2, 2, 2, 1, 1, 1, -1, 3, 3, 2, 2, 1, 1, -1, 3, 2, 1, -1]



import java.util.ArrayList;

class Solution {
    public ArrayList<Integer> printPat(int n) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = n; i >= 1; i--) {        // rows
            for (int j = n; j >= 1; j--) {    // numbers
                for (int k = 1; k <= i; k++) {
                    list.add(j);
                }
            }
            list.add(-1); // row separator
        }

        return list;
    }
}





ARRAY SWAP:
    import java.util.*;

class Main {

    static int[] swap(int[] arr1) {
        int i = 0;
        int j = arr1.length - 1;

        while (i < j) {
            int temp = arr1[i];
            arr1[i] = arr1[j];
            arr1[j] = temp;
            i++;
            j--;
        }
        return arr1;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};

        System.out.println(Arrays.toString(arr1));
        swap(arr1);
        System.out.println(Arrays.toString(arr1));
    }
}


SLIDING WINDOW


Given an array of positive integers nums and a positive integer target, return the minimal length of a subarray whose sum is greater than or equal to target. If there is no such subarray, return 0 instead.

 

Example 1:

Input: target = 7, nums = [2,3,1,2,4,3]
Output: 2
Explanation: The subarray [4,3] has the minimal length under the problem










    class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0;
        int sum = 0;
        int minLen = Integer.MAX_VALUE;

        for (int right = 0; right < nums.length; right++) {
            sum += nums[right];              // expand

            while (sum >= target) {          // shrink
                minLen = Math.min(minLen, right - left + 1);
                sum -= nums[left];
                left++;
            }
        }

        return minLen == Integer.MAX_VALUE ? 0 : minLen;
    }
}

