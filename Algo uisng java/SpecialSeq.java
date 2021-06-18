// 1 11 21 1211 111221 312211 12112221 and so on 111221 means the previous have "one 1's one 2's and two 1's , i.e, 1211
// print the above pattern sum input size of array and that number of elements as to which position sum we have to find.


import java.util.*;
public class SpecialSeq {
    static String start;
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num;
        num = sc.nextInt();
        
        
        int numarr[] = new int[num];
        int resultArr[] = new int[num];
        for(int i= 0; i < num; i++)
        {
            numarr[i] = sc.nextInt();
          
            String pattern  = findNumber(numarr[i]);
            //System.out.println(pattern);
            
            resultArr[i] = findSum(pattern);
        }
        
        for(int i = 0; i < num ; i++)
        {
            System.out.println(resultArr[i]);
        }
        sc.close();
    }

    public static int findSum(String pattern)
    {
        if(pattern == "1")
            return 1;
        if(pattern == "11")
            return 2;
        String temp = "";
        int count = 0;
        for(int j = 0; j < pattern.length(); j++)
            {
               
                char ch = pattern.charAt(j);
                temp += ch;
                int number = Integer.parseInt(temp);
                count += number;
                temp = "";
            }

        return count;
    }

    public static String findNumber(int n)
    {
        if(n == 1)
            return "1";
        if(n == 2)
            return "11";
        String str = "11";
        for(int i = 3; i<= n; i++)
        {
            str = str+"$";
            int len = str.length();
            int count = 1;
            String temp = "";
            char []arr = str.toCharArray();
            for(int j=1; j<len; j++)
            {
                if(arr[j] != arr[j-1])
                {
                    temp += count + 0;
                    temp += arr[j-1];
                    count = 1;
                }
                else
                {
                    count++;
                }
            }
            str = temp;
        }
        return str;
    }
}
     
