import java.util.Scanner;
public class Name {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter your name: ");
        String name = input.next();
        System.out.println("Good morning " + name);
    }
}
