import java.util.Scanner;

public class TestClass1 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();
        char[] ch = str.toCharArray();
        int start =0; 
        int len = ch.length;
        int end = len-1;
        int flag = 1;
        while(start <= end)
        {
            if(ch[start] != ch[end] || !Character.isLetter(ch[start]) || !Character.isLetter(ch[end]))
            {
                flag = 0;
                break;
            }
            start++;
            end--;
        }

        if(flag == 1)
            System.out.println("you have entered a strong string");
        else
            System.out.println("you have entered a weak string");
    }
    
}
