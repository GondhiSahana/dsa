import java.util.Scanner;

public class SubProSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter some input: ");
        int num = in.nextInt();
        int sum = 0;
        int product = 1;

        while (num > 0) {
            int digit = num % 10;
            sum = sum + digit;
            product = product * digit;
            num = num / 10;
        }
        System.out.println(product-sum);
    }
    
}
