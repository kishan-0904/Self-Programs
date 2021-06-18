/* Represent numbers 1 to n. But for multiple of 3 display Fizz, for multiple of 5 display Buzz
    and for multiples of both display FizzBuzz */

import java.util.*;
public class FizBuzz412 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        List<String> list;
        list = fizBuzz(num);
        for(String temp : list)
            System.out.println(temp);
    }

    public static List<String> fizBuzz(int n)
    {
        List<String> res = new ArrayList<>();
        for(int i=1; i<= n; i++)
        {
            if(i%3 == 0 && i%5 == 0)
                res.add("FizzBuzz");
            else if(i%3 == 0)
                res.add("Fizz");
            else if(i%5 == 0)
                res.add("Buzz");
            else
                res.add(Integer.toString(i));
        }
        return res;
    }
}