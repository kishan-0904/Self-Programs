// n springrolls among m people


import java.util.Scanner;
public class TestClass {

    public static int getCakeCuts(int n, int m)
    {
        int ncuts = -1; 
        int rem, gc, temp, eachcut;  //YAHAN TK HO RKHA HAI.. START FROM NEXT ONE
        if(n%m == 0)
            return 0;
        if(n > m)
        {
            rem = n%m;
            gc = gcd(rem,m);
            temp = rem;
            rem = rem/gc;
            m = m/gc;
            eachcut = m-rem;
            ncuts = eachcut * temp;
        }
        else
        {
            gc = gcd(n,m);
            temp = n;
            n = n/gc;
            m = m/gc;
            eachcut = m-n;
            ncuts = eachcut*temp;
        }
        return ncuts;
    }
    public static int gcd(int a, int b)
    {
        if(b == 0)
            return a;
        return gcd(b, a%b);
    }

    //TILL HERE



    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println(getCakeCuts(n,m));
    }
    
}
