//EUCLEDIAN METHOD FOR GCD

public class Gcd 
{
    public static void main(String[] args)    
    {
        int m,n;
        m=5; n=28;
        int result = gcd(m,n);
        System.out.println(result);
    }
    static int gcd(int m, int n)
    {
        while(n > 0)
        {
            return gcd(n, m%n);
        }
        return m;
    }
}
