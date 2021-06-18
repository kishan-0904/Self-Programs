import java.util.*;
public class Palindrome1 
{
    public static void main(String args[])
    {
        int n,k;
        String s;
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        k=sc.nextInt();
        if(n<1)
        {
            System.out.println("-1");
            System.exit(0);
        }
        s=sc.nextLine();
        char string[] = s.toCharArray();
        int diff =0;
        for(int i=0, j=s.length()-1; i> n/2; i++, j--)
        {
            if(string[i] != string[j])
                diff++;
        }

        if(diff > k)
        {
            System.out.println("-1");
            System.exit(0);
        }
        char max = ' ';
        for(int i=0, j=n-1; i<j; i++,j--)
        {
            if(string[i] == string[j])
            {
                continue;
            }
            max = string[i] > string[j] ? string[i] : string[j];
            if(string[i] != max)
            {
                string[i] = max;
                k--;
            }
            else
            {
                string[j] = max;
                k--;
            }
        }
        if(k == 0)
        {
            s= String.valueOf(string);
            s = isPalindrome(s) ? s : "-1";
            System.out.println(s);
        }




        sc.close();
    }
    public static boolean isPalindrome(String s)
    {
        int i=0;
        int j = s.length() -1;

        while(j>i)
        {
            if(s.charAt(i) == s.charAt(j))
            {
                i++;
                j--;
            }
            else
            {
                return false;
            }
        }
        return true;
    }
}
