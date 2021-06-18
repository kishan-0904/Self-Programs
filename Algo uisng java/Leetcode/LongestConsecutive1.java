public class LongestConsecutive1 {
    public static void main(String[] args) {
        //String str = "01110011111011111101";
        /*int ptr1 =0,ptr2 = 0;
        int len = str.length();
        int result =0, temp =0;
        for(int i=0; i<len; i++)
        {
            if(str.charAt(i) == '0')
            {
                if(ptr1 != ptr2)
                {
                    temp = ptr2-ptr1;
                    if(result < temp)
                        result = temp;
                }
                ptr1 = ptr2 = i;
            }
            else
            {
                ptr2 = i;
            }
        }
        if(ptr1 != ptr2)
        {
            temp = ptr2-ptr1;
            if(result < temp)
                result = temp;
        }
        System.out.println(result); */

        String str = "01110011111011111101";
        int temp=0, max =0;
        int len = str.length();
        for(int i=0; i<len; i++)
        {
            if(str.charAt(i) == '0')
                continue;
            temp =0;
            for(int j=i; j<len;j++)
            {
                if(str.charAt(j) == '1')
                {
                    temp++;
                }
                else
                {
                    i=j;
                    break;
                }
            }
            if(max < temp)
                max = temp;
            
        }
        System.out.println(max);
    }
}
