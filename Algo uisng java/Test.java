public class Test {
    public static void main(String[] args)
    {
        int d = (int)(Math.ceil(Math.log(16)/Math.log(2)));
        int limit = (int)Math.pow(2,d);

        System.out.println(d);
        System.out.println(limit);

    }
}
