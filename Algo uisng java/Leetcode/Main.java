import java.util.*;
public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        for(int i=num; i>0; i--)
        {
            for(int k= 1; k<=num-i; k++)
                System.out.print(" ");
            for(int j =1; j<=i; j++)
                System.out.print("* ");
            System.out.println();
        }
        
    }
}