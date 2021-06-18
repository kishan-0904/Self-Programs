public class CountOccurence {
    public static void main(String[] args)
    {
        String str = "aaabbccjhaabg";
        char[] ch = str.toCharArray();
        int len = ch.length;
        int count;
        for(int i =0; i<len; i++)
        {
            if(ch[i] == '\0')
                continue;
            count = 1;
            for(int j=i+1; j<len; j++)
            {
                if(ch[i] == ch[j])
                {
                    count++;
                    ch[j] = '\0';
                }
            }
            System.out.print(ch[i]);
            System.out.print(count);
        }
    }
}