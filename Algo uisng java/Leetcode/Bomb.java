import java.util.*;
class Bomb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int[][] matrix = new int[n][m];
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<m; j++)
            {
                matrix[i][j] = sc.nextInt();     
            }
        }
        sc.close();
        int count;
        int cost = 0;
        HashSet<Integer> rowCount = new HashSet<Integer>();
        HashSet<Integer> colCount = new HashSet<Integer>();
        int z = 0;
        for(int[] temp : matrix)
        {
            count = 0;
            int y=0;
            for(int x : temp)
            {
                if(x == 1)
                {
                    count++;
                    colCount.add(y);
                }
                y++;
            }
            if(count > 0)
                rowCount.add(z);
            z++;
            if(count == 0)
                continue;
            int max = (a>=(b*count))?a:b;
            cost = cost + max;
        }
        int max = (rowCount.size()*a <= colCount.size()*b)?rowCount.size()*a:colCount.size()*b;
        System.out.println((max<=cost)?max:cost);
    }
    
}
