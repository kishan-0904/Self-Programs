import java.util.*;
class CountString {

    public static int NumberSearch(String str)
    {
        int count =0;
        int sumDigit = 0, charCount =0;
        for(int i=0;i<str.length(); i++)
        {
            char ch = str.charAt(i);
            if(Character.isDigit(ch))
            {
                sumDigit += ch - 48;
            }
            if(Character.isLetter(ch))
            {
                charCount++;
            }
            try
            {
            count = Math.round(sumDigit/charCount);
            }catch(Exception e)
            {
                return 0;
            }
        }
        return count;
    }

    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        System.out.println(NumberSearch(s.nextLine()));
    }
}