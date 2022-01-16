import java.util.Scanner;
public class Distance {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1,x2,y1,y2;
        double distance = 0;
        System.out.print("Enter the co-ordinates of the first point (x1,y1): ");
        x1 = in.nextInt();
        y1 = in.nextInt();
        System.out.print("Enter the co-ordinates of the second point (x2,y2): ");
        x2 = in.nextInt();
        y2 = in.nextInt();

        distance = Math.sqrt((x2-x1)*(x2-x1) +(y2-y1) *(y2-y1));
        System.out.println("The Distance between the two points is " + distance);
        in.close();

    }
}
