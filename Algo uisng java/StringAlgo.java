import java.util.*;
public class StringAlgo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input;
        input = sc.nextLine();
        String arr[];
        arr = input.split("\\s+" , 5);
        String temp="";
        for(String x : arr)
        {
            temp = temp + x.charAt(0);
            temp = temp.toUpperCase();
            temp=temp + x.substring(1);
            System.out.println(temp);
            temp="";
        }
        sc.close();
    }
}
