import java.util.Scanner;

public class Main
{
    public static void main(String args[])
    {
        int N;
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        int arr[] = new int[N+1];
        arr[0] = sc.nextInt();
        for(int i =1; i<=N;i++)
            arr[i] = sc.nextInt();
        int count = deletions(N,arr);
        System.out.println(count);
        sc.close();
    }
    public static int deletions(int input1, int[] input2)
    {
        int max = input2[0];
        for(int i=1; i<=input1;i++)
        {
            if(input2[i] > max)
                max = input2[i];
        }
        int count =0;
        for(int i =1; i<=input1; i++)
        {
            if(input2[i]*2 >= max)
                continue;
            count++;
        }
        return count;
    }
}