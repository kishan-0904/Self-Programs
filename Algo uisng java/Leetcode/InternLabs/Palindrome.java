package InternLabs;

import java.util.*;
public class Palindrome {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();
        sc.close();
        boolean result = checkPalindrome(num);
        System.out.println(result);
    }

    public static boolean checkPalindrome(long n)
    {
        long temp = 0;
        while(n > temp)
        {
            int rem = (int)n%10;
            temp = temp*10+rem;
            n /= 10;
        }
        return n==temp || n==temp/10;
    }
}
