import java.util.Scanner;
public class SimpleInterest {
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the value of principal: ");
        double principal = input.nextDouble();

        System.out.println("Enter the value of time: ");
        double time = input.nextDouble();
        
        System.out.println("Enter the value of rate: ");
        double rate = input.nextDouble();

        double Interest = (principal * time * rate)/(100);

        System.out.println("Principal = " +principal);
        System.out.println("Time = " +time);
        System.out.println("Rate = " +rate);
        System.out.println("SimpleInterest = " +Interest);
    }
    
}
