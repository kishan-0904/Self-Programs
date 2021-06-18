// Time - O(n)  Space- O(1)

import java.util.*;

public class Palindrome9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        boolean result = isPalindrome(num);
        if(result == true)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
    public static boolean isPalindrome(int n)
    {
        if(n<0 || (n%10 == 0 && n!=0))
            return false;
        int reversedNum = 0;
        int pop;
        while(n>reversedNum)
        {
            pop = n%10;
            reversedNum = reversedNum * 10 + pop;
            n = n/10;
        }
        return (n == reversedNum || n == reversedNum/10);
        
    }

}

//      Alternate Solution
/*
    if(n<0 || (n%10 == 0 && n!=0))
            return false;
    String str = Integer.toString(n);
        for(int i =0; i<str.length()-i-1; i++)
        {
            if(str.charAt(i) == str.charAt(str.length()-i-1))
                continue;
            else
                return false;
        }
        return true;

*/