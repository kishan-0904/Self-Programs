import java.util.*;
public class Stations
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    int soln[] = new int[t];
    int x = 0;
    while(t > 0)
    {
      int num = sc.nextInt();
      soln[x++] = noOfStations(num);
      t--;
    }
    int i;
    for(i =0; i<x-1; i++)
    	System.out.println(soln[i]);
    System.out.print(soln[i]);
    sc.close();
  }
  public static int noOfStations(int n)
  {
      int []dp = new int[n+3];
      dp[0] = 1;
      dp[1] = 2;
      dp[2] = 3;
      for(int i =3; i<n+2; i++)
        dp[i] = dp[i-1] + dp[i-2] + dp[i-3];
      return dp[n];
  }
}