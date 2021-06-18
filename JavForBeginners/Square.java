import java.util.*;

abstract class Shape
{
    public int side;
    abstract double calculateArea();

   
}

public class Square extends Shape{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int side = sc.nextInt();
        //Shape square = new Square(side);
    }

    @Override
    double calculateArea() 
    {

        return 0;
    }  
    
}
