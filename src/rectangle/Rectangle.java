package rectangle;
import java.util.*;
public class Rectangle {

    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double length,width;
        System.out.println("enter the length and width of the rectangle");
        length=sc.nextDouble();
        width=sc.nextDouble();
        double area=length*width;
        double perimeter=2*(length+width);
        System.out.println("area of the rectangle: " +area);
        System.out.println("perimeter of the rectangle: " +perimeter);
        
    }
    
}
