public class Exercise1 {
    public static void main(String args[])   {
        String s = "data structures";
        System.out.println(s.length());
        System.out.println(s.charAt(5));
        System.out.println(s.indexOf("a"));
        System.out.println(s.indexOf("m"));
        System.out.println(s.indexOf("a s"));
        System.out.println(s.indexOf("d",1));
        System.out.println(s.substring(5,10));
        System.out.println(s.toUpperCase());


        String a="stack";
        String b="queue";
        String c="Stack";
        System.out.println(a == b);
        System.out.println(a.equalsIgnoreCase(c));
        System.out.println(a.compareTo(c));
        System.out.println(b.compareTo(a));

        if(a.compareTo(b) <0)
            System.out.println("1");
        else
            System.out.println("-1");
            
    }
}
