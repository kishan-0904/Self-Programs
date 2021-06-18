package InternLabs;

import java.util.*;
public class Prime {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        boolean b = checkPrime(num);
        System.out.println(b);
        
    }

    public static boolean checkPrime(int n)
    {
        for(int i=2; i<=n/2; i++)
        {
            if(n%i == 0)
                return false;
        }
        return true;
    }
}
