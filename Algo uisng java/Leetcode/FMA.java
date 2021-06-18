import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class FMA
{
    public static void main(String[] args)
    {
        int a,b,c,d;
        a=1;
        b=2;
        c=3;
        d=4;
        int xor;
        int sum =0;
        for(int i=a; i<=b; i++)
        {
            for(int j=c; j<=d; j++)
            {
                xor = i^j;
                sum = (sum + xor) % 1000000007;
            }
        }
        return sum;
    }


