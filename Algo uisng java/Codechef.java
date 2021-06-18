/*

import java.util.*;

class Codechef
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int C[] = new int[T];
        for(int i=0; i<T; i++)
        {
            C[i] = sc.nextInt();
        }
        
        for(int X : C)
        {
            int product = 1;
            int d = (int)(Math.ceil(Math.log(X)/Math.log(2)));
            int limit = (int)Math.pow(2,d);
            int temp =0,j;
            for(int i=1; i<limit;i++)
            {
                for(j=i+1;j<limit;j++)
                {
                    if(i==j)
                        continue;
                    if((i^j) == X)
                        temp = i*j;
                    if(temp > product)
                        product = temp;
                }
            }
            System.out.println(product);
        }
    }
}


*/



import java.util.*;

class Codechef
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        long C[] = new long[T];
        for(int i=0; i<T; i++)
        {
            C[i] = sc.nextLong();
        }
        
        for(long X : C)
        {
            long product = 1;
            //finding the samllest integer
            int d = (int)(Math.ceil(Math.log(X)/Math.log(2)));
            //now deciding the upper limmit of the numbers
            long limit = (int)Math.pow(2,d);
            long temp;
            for(long i =0; i<limit;i++)
            {
                temp = 0;
                long x = (X ^ i);
                if(x<limit)
                {
                    temp = x*i;
                }
                
                if(temp > product)
                {
                    product = temp;
                }
                
            }
            System.out.println(product);
        }
        
    }
}