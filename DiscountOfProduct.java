import java.util.Scanner;

public class DiscountOfProduct {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the price of the product: ");
        double price = in.nextDouble();
        double discount = 0;
        if(price > 1000) {
            discount = price * 0.1;
        }
        else if(price>500) {
            discount = price * 0.2;
        }
        else{
            discount = price * 0.3;
        }
        double total = price - discount;
        System.out.println("Toatl Price of the Product is: "+total);
        System.out.println("Discount of the Product is: "+discount);
        in.close();
    }
    
}
