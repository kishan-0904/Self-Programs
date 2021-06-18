//Using double pointer starting from the end.
//Fetch every word and go on  adding it to the StringBuffer.

public class ReverseWordsInString {
    public static void main(String[] args)
    {
        String str = "The sky is blue";
        String result = wordRev(str);
        System.out.println(result);
    }

    public static String wordRev(String str)
    {
        StringBuffer sb = new StringBuffer();
        int i = str.length()-1;
        while(i>=0)
        {
            if(str.charAt(i) == ' ')
            {
                i--;
            }
            else
            {
                int j=i;
                while(i>=0 && str.charAt(i)!= ' ')
                {
                    i--;
                }
                if(sb.length()>0)
                {
                    sb.append(" ");
                }
                for(int k=i+1; k<=j;k++)
                {
                    sb.append(str.charAt(k));
                }
            }
        }
        return sb.toString();
    }
}
