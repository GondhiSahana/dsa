import java.util.Scanner;
public class AverageOfNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of Elements: ");
        int n = in.nextInt();
        int sum =  0;
        System.out.println("Enter the "+n+" elements respectively :");
        for(int i = 0; i < n; i++) {
            int num = in.nextInt();
            sum += num;
        }
        double average = (double) sum / n;
        System.out.println(average);
        in.close();

    }
    
}
