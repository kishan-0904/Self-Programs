import java.util.*;
class Palindrome
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);
        int num,k;
        num=sc.nextInt();
        k= sc.nextInt();
        String s;
        s = sc.nextLine();
        String result = highestPal(s,num,k);
        System.out.println(result);
        sc.close();
    }
    public static String highestPal(String s, int n, int k)
    {
        int low = 0;
        int high = n-1;
        char[] string = s.toCharArray();
        int diff =0;
        for(int i=0, j=n-1; i< j; i++,j--)
        {
            if(string[i] != string[j])
            {
                diff++;
            }
        }
        if(diff > k)
        {
            return "-1";
        }
        while(high >= low)
        {
            if(k <= 0)
            {
                break;
            }
            if(string[low] == string[high])
            {
                if(k>1 && (k-2) >= diff && string[low] != '9')
                {
                    string[low] = '9';
                    string[high] = '9';
                    k-=2;
                }
            }   
            else
            {
                if(k>1 && (k-2) >= diff-1)
                {
                    if(string[low] != '9')
                    {
                        string[low] = '9';
                        k--;
                    }
                    if(string[high] != '9')
                    {
                        string[high] = '9';
                        k--;
                    }
                }
                else
                {
                    if(string[low] > string[high])
                    {
                        string[high] = string[low];
                    }
                    else
                    {
                        string[low] = string[high];
                    }
                    k--;
                }
                diff--;
            }
            if(low == high && k>0)
            {
                string[low] = '9';
                k--;
            }
        low++;
        high--;
        }
        s = String.valueOf(string);
        return isPalindrome(s) ? s : "-1";
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