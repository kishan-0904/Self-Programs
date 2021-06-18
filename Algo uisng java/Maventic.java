import java.util.*;
public class Maventic {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String input;
        input = sc.nextLine();
        String arr[] = input.split(" ");
        int max = 0, count =0;
        String temp="";
        String result="";
        char ch;
        for(String x : arr)
        {
            for(int j=0;j<x.length();j++)
            {
                ch = x.charAt(j);
                if((ch >='a' && ch <='z') || (ch >='A' && ch <='Z'))
                {
                    count++;
                    temp = temp+ch;
                }
            }
            if(max < count)
            {
                max = count;
                result = temp;
            }
            temp="";
        }
        System.out.println(result);


        sc.close();
    }
}
