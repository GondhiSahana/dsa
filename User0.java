import java.util.Scanner;
public class User0 {
    public static void main(String[] args) {
        //Take integer inputs till the user enter 0 and print the sum of all numbers
        Scanner in = new Scanner(System.in);
        int sum = 0;
        int num;

        System.out.println("Please enter number: ");
        do{
            num = in.nextInt();
            sum = sum + num;
        }
        while(num != 0);
        System.out.println("Sum = " + sum);
    }
}
