import java.util.Scanner;

public class AverageOfMarks {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your marks: ");
        double marks= in.nextInt();
        double sum = 0;
        int num = 0;
        while(marks >= 4)
        {
            sum += marks;
            num++;
            marks = in.nextDouble();
        }
        double average = sum/num;
        System.out.println("Average: "+average);
        in.close();
    }
}
