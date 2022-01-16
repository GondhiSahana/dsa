import java.util.Scanner;
public class BattingAverage {
    public static void main(String[] args) {
        //Calculate Batting Average
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the num of runs: ");
        int runs = in.nextInt();
        System.out.println("Enter number of matches: ");
        int matches = in.nextInt();
        System.out.println("Enter the no of not-out matches: ");
        int notout = in.nextInt();
        int outmatches = matches - notout;
        double bataverage = runs/outmatches;
        System.out.println("Batting Average = "+bataverage);
        in.close();

    }
}
