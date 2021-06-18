public class ValidSeq {
    public static void main(String[] args)
    {
        int[] arr= {1,10,43,22,56,0,-1,53};
        int seq[] = {1,22,0,53};
        int temp =0;
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i] == seq[temp])
            {
                temp++;
            }
            
        }
        if(temp == seq.length)
            System.out.println("True");
        else
            System.out.println("False");
    }   
}
