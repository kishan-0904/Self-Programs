import java.util.*;
public class Shift {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input;
        input = sc.nextLine();
        String arr[];
        arr = input.split("\\s");
        String temp = "";
        for(String x : arr)
        {
            int len = x.length();
            for(int i=0;i<len;i++)
            {
                if((x.charAt(i)>=65 && x.charAt(i)<=90) && (char)(x.charAt(i)+len)>90)
                    temp+="Z";
                else if((x.charAt(i)>=97 && x.charAt(i)<=122) && (char)(x.charAt(i)+len)>122)
                    temp+="z";
                else
                    temp += (char)(x.charAt(i)+len);
            }
            System.out.print(temp+" ");
            temp = "";
        }
        sc.close();
    }
}
