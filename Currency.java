import java.util.Scanner;

public class Currency {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter rupees: ");
        double inr = in.nextInt();
        double usd = inr*0.013;
        System.out.println("The value in USD : "+usd);
        return;
    }
}
