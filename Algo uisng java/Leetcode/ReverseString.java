//Reverse a given string
/*
Use two pointers one at start and other at end.
Swap the pointer values and left+1 right-1
until left < right
*/



public class ReverseString {
    public static void main(String[] args)
    {
    String str = "Kishan Kr Jaiswal";
    char ch[] = str.toCharArray();
    int len = ch.length;
    int left, right;
    left = 0;
    right = len-1;
    char temp;
    while(left < right)
    {
        temp = ch[left];
        ch[left] = ch[right];
        ch[right] = temp;
        left++;
        right--;
    }
    for(char x: ch)
        System.out.print(x);
}
}
