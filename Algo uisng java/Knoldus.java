import java.util.*;
public class Knoldus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row1,col1,row2,col2;
        row1 = sc.nextInt();
        col1 = sc.nextInt();
        row2 = sc.nextInt();
        col2 = sc.nextInt();
        boolean b;
        int x = 0;
        b = isSafe(row1,col1,row2,col2);
        if(b == true)
            System.out.println("-1");
        else {
            x = kingMove(row1, col1, row2, col2);
            System.out.println(x);
        }
        sc.close();
    }

    public static int kingMove(int row1, int col1, int row2, int col2) {
        int x = 0;
        if( (row2-1 == row1  || row2 == row1  || row2+1 == row1) && (col2-1 == col1  || col2 == col1  || col2+1 == col1) )
            return -1;
        if(row2-1 > 0)
        {
            if( isSafe(row1, col1, row2-1, col2-1) == true  && col2-1 > 0) 
                ++x;
            if( isSafe(row1, col1, row2-1, col2) == true)
                ++x;
            if( isSafe(row1, col1, row2-1, col2+1) == true  && col2+1 < 9)
                ++x;
        }

        if( col2-1 > 0 && isSafe(row1, col1, row2, col2-1) == true)
            ++x;
        if( col2+1 < 9 && isSafe(row1, col1, row2, col2+1) == true)
            ++x;


        if(row2+1 < 9)    
        {
            if( isSafe(row1, col1, row2+1, col2-1) == true  && col2-1 > 0)
                ++x;
            if( isSafe(row1, col1, row2+1, col2) == true)
                ++x;
            if( isSafe(row1, col1, row2+1, col2+1) == true && col2+1 < 9)
                ++x;
        }

        return x;
    }

    public static boolean isSafe(int row1, int col1, int row2, int col2) {
        if(row1 == row2)
            return false;
        if(col1 == col2)
            return false;
        if( Math.abs(row1-row2) == Math.abs(col1-col2))
            return false;
        
        return true;
    }
    
}