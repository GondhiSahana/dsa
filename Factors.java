import java.util.Scanner;
public class Factors {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the input: ");
        int input = in.nextInt();
        System.out.println("Factors of input are: "+input);

        for (int i = 1; i<=input; ++i) {
            if(input %i == 0) {
                System.out.println(i + " ");
            }
        }
    }
}
