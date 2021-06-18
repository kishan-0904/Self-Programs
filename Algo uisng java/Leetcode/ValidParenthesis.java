import java.util.*;

public class ValidParenthesis {
    public static void main(String args[])
    {
        //Scanner sc = new Scanner(System.in);
        String str = "(){[]}()";
        boolean result = isValid(str);
        System.out.println(result);
    }

    public static boolean isValid(String s)
    {
        Stack<Character> stack = new Stack<Character>();
        for(char c : s.toCharArray())
        {
            if(c == '{')
                stack.push('}');
            else if(c == '[')
                stack.push(']');
            else if(c == '(')
                stack.push(')');
            else if(stack.isEmpty() || stack.pop() != c)
                return false;
        }
        return stack.isEmpty();
    }
}
