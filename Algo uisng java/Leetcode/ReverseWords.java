public class ReverseWords {
    public static void main(String[] args)
    {
        String str = "I love programming";
        int len = str.length();
        String temp = "";
        String result ="";
        for(int i=0; i<len; i++)
        {
            
            if(str.charAt(i)!=' ')
            {
                temp = temp + str.charAt(i);
            }
            else
            {
                for(int j=temp.length()-1; j>=0; j--)
                {
                    result = result + temp.charAt((j));
                }
                result = result + " ";
                temp = "";
            }
        }
        for(int j=temp.length()-1; j>=0; j--)
                {
                    result = result + temp.charAt((j));
                }
                result = result + " ";
        System.out.println(result);
    }
}
