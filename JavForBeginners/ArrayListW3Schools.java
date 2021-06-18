import java.util.*;
public class ArrayListW3Schools {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> c = new ArrayList<Integer>();
        ArrayList<String> code = new ArrayList<String>();
        String str;
        int temp;
        for(int i=0; i<3;i++)
        {
            str = sc.next();
            code.add(str);
            temp = sc.nextInt();
            c.add(temp);
        }
        code.set(2, "element");
        System.out.println(code.get(2));
        System.out.println(c.get(2));


        for(int i : c)
            System.out.println(i);


        sc.close();
    }
}
