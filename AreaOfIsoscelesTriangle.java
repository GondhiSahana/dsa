import java.util.Scanner;

public class AreaOfIsoscelesTriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the length of the same sided: ");
        double a = in.nextInt();
        System.out.println("Enter the side2 of isosceles triangle: ");
        double b = in.nextInt();
        double area = (b/4) * Math.sqrt((4 * a * a) - (b * b));
        System.out.println("Area of isosceles triangle is: " + area);
    }
    
}
