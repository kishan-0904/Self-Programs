import java.util.HashMap;
import java.util.Scanner;

public class LongestSubWithoutRep {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();
        HashMap<Character,Integer> repCount = new HashMap<Character,Integer>();
        //int left, right;
        int result;
        result = 0;
        for(int i=0, j=0; j<str.length(); j++)
        {
            if(repCount.containsKey(str.charAt(j)))
                i = Math.max(repCount.get(str.charAt(j)),i);
            result = Math.max(result, j-i+1);
            repCount.put(str.charAt(j), j+1);
        }
        System.out.println(result);
    }
}
