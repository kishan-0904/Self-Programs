import java.util.*;
public class CountOccurence  {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String arr[] = input.split(" ");
        HashMap<String, Integer> count= new HashMap<String, Integer>();
        for(String temp : arr)
        {
            if(count.containsKey(temp))
                count.put(temp, count.get(temp)+1);
            else
                count.put(temp,1);
        }

        /*for (Map.Entry entry : count.entrySet()) 
        { 
            System.out.println(entry.getKey() + " = " + entry.getValue()); 
        } */
        System.out.println(Collections.singletonList(count));

        sc.close();
        
    }
}