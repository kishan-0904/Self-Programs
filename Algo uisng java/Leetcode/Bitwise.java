import java.util.*;
public class Bitwise {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int t,a,b,n;
        t= sc.nextInt();
        while(t>0)
        {
            a = sc.nextInt();
            b = sc.nextInt();
            n = sc.nextInt();
            int result = good(a,b,n);
            System.out.println(result);
            t--;
        }
        sc.close();
    }

    public static int good(int a, int b, int n)
    {
        if(a >= n || b >= n)
            return 0;
        if(a+b <= Math.min(a,b))
            return -1;
        return 1+good(a+b, Math.max(a,b), n);
    }
}