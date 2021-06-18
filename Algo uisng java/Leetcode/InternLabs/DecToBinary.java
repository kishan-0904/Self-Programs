package InternLabs;

import java.util.*;

public class DecToBinary {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        Vector<Integer> bin = new Vector<Integer>();
        int temp = num;
        while(temp > 0)
        {
            bin.add(temp%2);
            temp /= 2;
        }
        for(int i = bin.size()-1; i>=0; i--)
            System.out.print(bin.get(i));
        System.out.println();
    }
}
