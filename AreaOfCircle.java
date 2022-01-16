import java.util.Scanner;
public class AreaOfCircle {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the radius of the circle : ");
        float radius = in.nextInt();
        System.out.println("Area of the circle is: " + (3.142 * radius * radius));
        System.out.println("Perimeter of the circle is: " + (2 * 3.142 * radius));
    }
}
