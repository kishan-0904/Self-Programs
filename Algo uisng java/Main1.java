import java.util.*;
public class Main1 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int input1[]  = {4,3,5};
        String input2 = "PNP";
        int input3 = 3;
        int result = findmaximum(input1, input2, input3);
        System.out.println(result);
        sc.close();
    }
    public static int findmaximum(int input1[], String input2, int input3)
    {
        int result = 0,sum = 0;
        for(int i = 0; i<input3; i++)
        {
            char ch = Character.toUpperCase(input2.charAt(i));
            if(ch == 'P')
                sum += input1[i];
            else
                sum -= input1[i];
        }
        result = sum * 100;
        return result;    
    }
}
