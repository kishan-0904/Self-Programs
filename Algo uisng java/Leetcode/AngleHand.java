import java.util.Scanner;
public class AngleHand
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int hh = sc.nextInt();
        int mm = sc.nextInt();
        sc.close();
        double angle = 0.0d;
        double hAngle, mAngle;
        if(hh>12 || mm > 60)
        {
            System.out.println("Invalid Input");
            System.exit(0);
        }

        hAngle = hh*30 + mm*0.5;
        mAngle = mm*6;
        angle = Math.abs(hAngle - mAngle);
        System.out.println(Math.min(angle, 360-angle));
    }
}