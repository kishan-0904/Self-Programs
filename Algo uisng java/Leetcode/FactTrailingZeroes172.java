// Find the number of trailing 0's in n!
// Time - O(log(n))
//      LOGIC
/*
Every time a 5 and its multiple comes in the series, a 0 increases.
so, a repeated division of 5 and the quotient gives the number of 0's each time
*/


import java.util.*;
public class FactTrailingZeroes172 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        num = sc.nextInt();
        sc.close();
        int count = countZeroes(num);
        System.out.println(count);
    }


    public static int countZeroes(int n) {
        int count = 0;
        while(n>0)
        {
            n /= 5;
            count+=n;
        }
        return count;
    }
}
