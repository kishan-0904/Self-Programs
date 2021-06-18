import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TestClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
        char[] ch = str.toCharArray();
        sc.close();
        for(char x : ch)
        {
            if(hm.containsKey(x))
                hm.put(x, hm.get(x)+1);
            else
                hm.put(x, 1);
        }
        long permu = fact(ch.length);
        for(Map.Entry<Character,Integer> entry : hm.entrySet())
        {
            int value = entry.getValue();
            if(value > 1)
                permu = permu/fact(value);
        }

        System.out.println(permu);

    }
    public static long fact(int x)
    {
        long fact = 1;
        for(int i=x; i>=1; i--)
            fact*=i;

        return fact;
    }
}
