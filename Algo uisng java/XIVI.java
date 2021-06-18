import java.util.*;
public class XIVI {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String lucky;
        int finalLen;
        lucky = sc.nextLine();
        finalLen = loveSeventeen(lucky);
        
        System.out.println(finalLen);
        sc.close();
    }
    public static int loveSeventeen(String lucky)
    {
        int count8=0, count9=0;
        int len = lucky.length();
        for(int i=0;i<len;i++)
        {
            if(lucky.charAt(i) == '9')
                count9++;
            if(lucky.charAt(i) == '8')
                count8++;
        }
        if(count8 == count9)
            len = len -(2*count8);
        else if(count8 < count9)
            len = len -(2*count8);
        else if(count9 < count8)
            len = len - (2*count9);
        return len;
    }
}
