import java.util.*;
class Largest
{
    public static void main(String args[])
    {
        
        String input;
        int i,sum=0;
        Scanner sc= new Scanner(System.in);
        input=sc.next();
        String[] strArray = input.split(",");
        int[] arr = new int[strArray.length];
        for(i=0;i<strArray.length;i++)
            arr[i]=Integer.parseInt(strArray[i]);
        
        System.out.println(LargestFour(arr));
    }
    public static int LargestFour(int arr[])
    {
        int sum=0;
        int i,temp,j,pos;
        for(i=0;i<4;i++)
        {
            temp=arr[i];
            pos=i;
            for(j=i+1;j<arr.length;j++)
            {
                if(arr[j]>temp)
                {
                    temp=arr[j];
                    pos=j;
                }
            }
            temp=arr[pos];
            arr[pos]=arr[i];
            arr[i]=temp;
            sum+=arr[i];
        }
        return sum;
    }
    

}