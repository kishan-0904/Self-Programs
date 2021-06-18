import java.util.Scanner;

public class Hourglass {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int matrix[][] = new int[5][5];
        int i,j;
        for(i=0; i<5; i++)
            for(j=0; j<5; j++)
                matrix[i][j] = sc.nextInt();
        
        int max =0;
        int result[][] = new int[3][3];
        for(i=0; i<3; i++)
        {
            for(j=0; j<3; j++)
            {
                result[i][j] = 0;
                result[i][j] += matrix[i][j] + matrix[i][j+1] + matrix[i][j+2]; 
                result[i][j] += matrix[i+1][j+1];
                result[i][j] += matrix[i+2][j] + matrix[i+2][j+1] + matrix[i+2][j+2];

                if(max < result[i][j])
                    max = result[i][j];
            }
            
        }

        System.out.println(max);

    }
}
