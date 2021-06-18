import java.util.*;
public class FrogJump {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] path = new int[n];
        for(int i=0; i<n;i++)
            path[i] = sc.nextInt();
        int steps = 1;
        sc.close();
        int stepsLeft = path[0];
        int maxJump = 0;
        int pos = 0;
        for(int i=1; i<n; i++)
        {
            if(stepsLeft !=0)
            {
                stepsLeft--;
                if(maxJump <= path[i])
                {
                    maxJump = path[i];
                    pos = i;
                }
            }
            else
            {
                i = pos;
                stepsLeft = path[i];
                maxJump = 0;
                steps++;
                if(i == n-2 && path[i] == 1)
                {
                    steps++;
                }
            }

        }
        System.out.println(steps);
    }
}