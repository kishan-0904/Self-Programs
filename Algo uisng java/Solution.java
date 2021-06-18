import java.util.*;
public class Solution {
    public static int getDecreasing(int N) {
        if(N <= 11)
            return N+1;
        else if(N<100)
        {
            String temp = Integer.toString(N);
            if(temp.charAt(0) >= temp.charAt(1))
                return 1+ getDecreasing(N-1);
            else
                return 0 + getDecreasing(N-1);
        }
        else if(N<1000)
        {
            String temp = Integer.toString(N);
            if(temp.charAt(0) >= temp.charAt(1) && temp.charAt(1) >= temp.charAt(2))
                return 1+ getDecreasing(N-1);
            else
                return 0 + getDecreasing(N-1);
        }
        else if(N<10000)
        {
            String temp = Integer.toString(N);
            if(temp.charAt(0) >= temp.charAt(1) && temp.charAt(1) >= temp.charAt(2) &&  temp.charAt(2) >= temp.charAt(3))
                return 1+ getDecreasing(N-1);
            else
                return 0 + getDecreasing(N-1);
        }
        else if(N<100000)
        {
            String temp = Integer.toString(N);
            if(temp.charAt(0) >= temp.charAt(1) &&  temp.charAt(1) >= temp.charAt(2) &&  temp.charAt(2) >= temp.charAt(3) &&  temp.charAt(3) >= temp.charAt(4))
                return 1+ getDecreasing(N-1);
            else
                return 0 + getDecreasing(N-1);
        }
        else
            return 1;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int N;
        N = sc.nextInt();
        int result;
        result = getDecreasing(N);
        System.out.println(result);
        sc.close();
    }
}


/*import java.util.*;
class Solution
{
    public static void main(String args[])
    {
       int sales;
       Scanner sc = new Scanner(System.in);
       sales =sc.nextInt();
       if(sales >= 30 && sales <=50)
       {
           System.out.println("D");
       }
       else if(sales >= 51 && sales <=60)
       {
           System.out.println("C");
       }
       else if(sales >= 61 && sales <=80)
       {
           System.out.println("B");
       }
       else if(sales >= 81 && sales <=100)
       {
           System.out.println("A");
       }
    }
}


 int num1,num2,num3,rem;
        Scanner sc = new Scanner(System.in);
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        num3 = sc.nextInt();
        int elem1[] = new int[4];
        int elem2[] = new int[4];
        int elem3[] = new int[4];
        int i = 0;
        int key, sum1=0,sum2=0;
        while(num1 > 0)
        {
            rem = num1 % 10;
            elem1[i] = rem;
            rem = num2 % 10;
            elem2[i] = rem;
            rem = num3 % 10;
            elem3[i] = rem;
            num1 /= 10;
            num2 /= 10;
            num3 /= 10;
            i++;
        }
        Arrays.sort(elem1);
        Arrays.sort(elem2);
        Arrays.sort(elem3);
        sum1 = elem1[3] + elem2[3] + elem3[3];
        sum2 = elem1[2] + elem2[2] + elem3[2];
        key = sum1 - sum2;
        System.out.println(key); 
        */