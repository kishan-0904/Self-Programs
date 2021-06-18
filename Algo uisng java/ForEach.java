public class ForEach {
    public static void main(String args[]) {
        int[][] arr = new int[3][5];
        for(int i = 0; i < 3; i++)
        for(int j=0; j < 5; j++)
            arr[i][j] = (i+1)*(j+1);

        for(int x[] : arr)   //selects each row
        {
            for(int y : x)      //elements from the seected row
            {
                System.out.println(y);
            }
            
        }
    }
}
