// Time - O(log n base 2)

//          LOGIC used
/*
if base negative then result = 1/|base|^power

2^10
power = even then base base*base power/2  
power = odd then base*base power-1
continue
*/


import java.util.*;
public class PowXN50 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x;
        int n;
        x = sc.nextDouble();
        n = sc.nextInt();
        sc.close();
        double result = findPow(x,n);
        System.out.println(result);
    }

    public static double findPow(double x, int n)
    {
        long num = n;
        double ans = 1.0;
        //absolute value
        if(n<0)
        {
            num = -1*num;
        }


        while(num  > 0) {
            if(num%2 == 0)
            {
                x = x*x;
                num /= 2;
            }
            else
            {
                ans = ans * x;
                num = num-1;
            }
        }

        if(n<0)
        {
            return 1.0/ans;
        }

        return ans;
    }

}
