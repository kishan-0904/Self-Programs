public class StrtoInt {
    public static void main(String[] args)
    {
        String input = "123";
        int result = toInt(input);
        System.out.println(result);
    }

    public static int toInt(String str)
    {
        int result =0;
        for(int i =0; i<str.length(); i++)
        {
            int num = str.charAt(i) - 48;
            result = result*10+num;
        }
        return result;
    }
}
