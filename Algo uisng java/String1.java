import java.util.Scanner;

public class String1 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String input;
        input = sc.nextLine();
        if(isPanlindrome(input))
            System.out.println("True");
        else
            System.out.println("False");
        sc.close();
    }
    public static boolean isPanlindrome(String str)
    {
        int first = 0 , last = str.length()-1;
        boolean choice = true;
        for(int i=0; i<str.length()-1; i++)
        {
            first = firstChar(str, first, last);
            last = lastChar(str, last, first);

            if(last <0 || first <0)
                break;
            if(Character.toLowerCase(str.charAt(first))  == Character.toLowerCase(str.charAt(last)))
            {
                first++;
                last--;
                continue;
            }
            choice = false;
            break;
        }
        return choice;
    }
    public static int firstChar(String str, int start, int end)
    {
        int first = -1;
        for(int i = start; i<=end; i++)
        {
            if((str.charAt(i)>='a' && str.charAt(i) <='z') || (str.charAt(i)>='A' && str.charAt(i) <='Z') )
            {
                first =i;
                break;
            }
        }
        return first;
    }
    public static int lastChar(String str, int start, int end)
    {
        int last = -1;
        for(int i = start; i>=end; i--)
        {
            if((str.charAt(i)>='a' && str.charAt(i) <='z') || (str.charAt(i)>='A' && str.charAt(i) <='Z'))
            {
                last =i;
                break;
            }
        }
        return last;
    }
    
}
