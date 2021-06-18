public class ReverseConstant {
    public static void main(String[] args)
    {
        String str = "I-love-India";

        char ch[] = str.toCharArray();
        int len = ch.length;
        int left, right;
        left = 0;
        right = len-1;
        char temp;
        while(left < right)
        {
            if(ch[left] == '-')
            {
                left++;
                continue;
            }
            if(ch[right] == '-')
            {
                right++;
                continue;
            }

            temp = ch[left];
            ch[left] = ch[right];
            ch[right] = temp;
            left++;
            right--;
        }
        for(char x: ch)
        System.out.print(x);
    }
}
