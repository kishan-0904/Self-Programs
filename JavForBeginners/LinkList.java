import java.util.*;

public class LinkList {
    public static void main(String args[])
    {
        LinkedList<Integer> list = new LinkedList<Integer>();
        Scanner sc = new Scanner(System.in);
        int input;
        for(int i =0; i<3; i++)
        {
            input = sc.nextInt();
            list.add(input);
        }

        list.addFirst(10);
        list.getFirst();
        
        list.addLast(100);
        list.getLast();
        
        list.removeFirst();
        list.removeLast();

        list.removeFirstOccurrence(12);
        list.removeLastOccurrence(12);

        System.out.println(list);
        sc.close();
    }
}
