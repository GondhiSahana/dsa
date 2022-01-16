import java.util.Scanner;
public class VolumeOfCone {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the radius of the Cone: ");
        double radius = in.nextInt();
        System.out.println("Enter the height of the Cone: ");
        double height = in.nextInt();

        double volume = 3.142 * radius * radius * (height / 3);
        System.out.println("Volume of Cone is: " + volume);

    }
    
}
