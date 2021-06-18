import java.util.*;
public class Count {
    public static void main(String args[])
    {
        int x=2, y=50;
        int count=0;
        do {
            ++x;
            y-= x++;
            ++count;
        }while(x<=10);
        System.out.println(count);
        System.out.println(y);
    }
}