import java.util.Scanner;

public class Practical 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a para:");
        String para = sc.nextLine();
        sc.close();
        String line1="", line2="";
        para = para.toUpperCase();
        int i,j,count=1;
        char ch;
        for(i=0;i<para.length();i++)
        {
            ch = para.charAt(i);
            if(ch == '.' || ch == '?' || ch == '!')
            {
                count++;
                continue;
            }
            if(count == 1)
            {
                line1 = line1 + ch;
                continue;
            }
            if(count == 2)
            {
                line2 = line2 + ch;
                continue;
            }
        }
        if(count!=2)
        {
            System.out.println("INVALID INPUT");
            System.exit(0);
        }
        System.out.println(line1);
        System.out.println(line2);
        String[] line1Array = line1.split(" ");
        String[] line2Array = line2.split(" ");
        for(i = 0; i < line1Array.length; i++)
        {
            count = 1;
            for(j =0; j < line2Array.length; j++)
            {
                if(line1Array[i].equals(line2Array[j]))
                {
                    count++;
                }
            }
            if(count > 1)
            {
                for(int k = i+1; k < line1Array.length; k++)
                {
                    if(line1Array[i].equals(line1Array[k]))
                    {
                        count++;
                        line1Array[k] = "0";
                    }
                }
            }
            if(count > 1)
            {
                System.out.println(line1Array[i] + "\t" + count);
            }
        }
    }
}
