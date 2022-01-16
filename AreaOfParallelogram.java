import java.util.Scanner;
public class AreaOfParallelogram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the base of the parallelogram: ");
        double base = in.nextInt();
        System.out.println("Enter the height of the parallelogram: ");
        double height = in.nextInt();
        System.out.println("Area of the parallelogram: " + (base * height));
        System.out.println("Perimeter of the parallelogram: "+ (2*(base + height)));
    }
    
}
