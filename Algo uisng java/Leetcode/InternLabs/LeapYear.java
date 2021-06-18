package InternLabs;

import java.util.*;
public class LeapYear {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        sc.close();
        boolean b = checkLeap(year);
        System.out.println(b);
    }

    public static boolean checkLeap(int n)
    {
        if(n%100 == 0)
        {
            if(n%400 == 0)
                return true;
            else
                return false;
        } 
        else
        {
            if(n%4 == 0)
                return true;
            else
                return false;
        }
    }
}
