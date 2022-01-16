import java.util.Scanner;
public class InputLargest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please Enter numbers: ");
        int input = 0;
        int large = 0;
        int small = 0;
        int counter = 0;
        while((input = in.nextInt()) != 0) {
            if(counter == 0) 
            small = large = input;
            counter++;

            if(input > large)
            large = input;

            if(input < small)
            small = input;
        }
        System.out.println(large);


    }
    
}
