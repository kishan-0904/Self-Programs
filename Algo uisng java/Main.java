import java.util.*;
public class Main {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String input;
        input = sc.nextLine();
        int num = sc.nextInt();
        int result = rotatedWords(input, num);
        System.out.println(result);
        sc.close();
    }
    public static int rotatedWords(String input1, int input2)
    {
        int count = 0;
        String arr[] = input1.split(" ");
        for(String temp : arr)
        {
            int i;
            String x = "";
            int len = temp.length();
            for(i = input2; i<len; i++)
                x = x + temp.charAt(i);
            for(i = 0; i<input2; i++)
                x = x + temp.charAt(i);
            if(temp.equals(x) == true)
                count++;
        }
        return count;
    }
}
