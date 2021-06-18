public class Variation {
    public static void main(String[] args)
    {
        for(int i=1; i<=5; i++)
        {
            for(int j=5; j>i; j--)
                System.out.print(" ");
            for(int k=1; k<=i; k++)
                System.out.print("* ");
            System.out.println();

            if(i==5)
            {
                int x = i-1;
                for(int j=5; j>x; j--)
                    System.out.print(" ");
                for(int k=1; k<=x; k++)
                    System.out.print("_ ");
                System.out.println();
            }
        }

        System.out.println();
    }
}
