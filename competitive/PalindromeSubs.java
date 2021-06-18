import java.util.*;
public class PalindromeSubs 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int max = 1;
        int len = str.length();
        int start = 0;
        int lo , hi;
        for(int i=1; i<len; i++)
        {
            lo = i-1;
            hi = i;
            while( lo >=0 && hi < len && str.charAt(lo) == str.charAt(hi))
            {
                if(hi-lo+1  > max)
                {
                    start = lo;
                    max = hi - lo + 1;
                }
                --lo;
                ++hi;
            }
            lo = i-1;
            hi = i+1;
            while( lo >= 0 && hi < len && str.charAt(lo) == str.charAt(hi))
            {
                if(hi-lo+1  > max)
                {
                    start = lo;
                    max = hi - lo + 1;
                }
                --lo;
                ++hi;
            }
        }
        lo = start;
        hi = start+max-1;
        System.out.println(str.substring(lo, hi+1));
        sc.close();
    }
}
