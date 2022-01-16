import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the length of the rectangle: ");
        double length = in.nextDouble();
        System.out.println("Enter the breadth of the rectangle: ");
        double breadth = in.nextDouble();
        System.out.println("Area of the rectangle = " + (length * breadth));
        System.out.println("Perimeter of the rectangle = " + (2*(length + breadth)));

        in.close();
    }
    
}
