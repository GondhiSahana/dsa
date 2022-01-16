import java.util.Scanner;
public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
    
        System.out.println("Enter the base of the triangle: ");
        double base = in.nextInt();
        System.out.println("Enter the height of the triangle: ");
        double height = in.nextInt();

        double area = (base*height)/2;
        System.out.println("Area of the triangle is: " +area );
        
        in.close();
    }
}
