import java.util.*;
public class Frequency {
    public static void main(String args[]) {
        String str;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String :");
        str = sc.nextLine();
        str = str.toUpperCase();
        int flag;
        int count;
        for(int i = 0; i<str.length(); i++)
        {
            count = 0;
            flag = 0;
            char ch = str.charAt(i);
            if(ch == ' ')
                continue;
            for(int j = i-1; j>=0; j--)
            {
                if(ch == str.charAt(j))
                {
                    flag =1;
                    break;
                }
            }
            if(flag==0)
            {
                for(int k = i; k<str.length(); k++)
                {
                    if(ch == str.charAt(k))
                        count++;
                }
                System.out.println(ch + " = " + count);
            }
            
        }
        sc.close();
    }
}











        /*String str;
        Scanner sc = new Scanner(System.in);
        int a[] = new int[26];
        for(int i = 0; i<26; i++)
            a[i] = 0;
        System.out.print("Enter the String :");
        str = sc.nextLine();
        str = str.toUpperCase();
        for(int i =0; i<str.length(); i++)
        {
            char ch = str.charAt(i);
            if(ch == ' ')
                continue;
            int x = ch - 65;
            a[x]++;
        }

        for(int i = 0; i<26; i++)
        {
            if(a[i] != 0)
            {
                char ch;
                ch = (char)(i+65);
                System.out.println(ch+ " = " +a[i]);
            }
        }
    }
} */
