import java.util.Scanner;

public class Swap {
    
    public static void main(String[] args){
        int a = 10;
        int b = 20;
        // tried by own{swap two numbers code}
    /*    Scanner in = new Scanner(System.in);
        System.out.print("Enter the value of num1: ");
        int num1 = in.nextInt();
        System.out.print("Enter the value of num2: ");
        int num2 = in.nextInt();
        int temp = num1;
        num1 = num2;
        num2  = temp;

        System.out.println("Swapping of num1 and num2 is: " + num1 +" " +num2);
    */

  
  /*  int a = 11;
    int b = 19;

    int temp = a;
    a = b;
    b = temp;

    System.out.println(a + " " + b);
    
 */

swap(a, b);
System.out.println(a + " " + b);
String name = "Sahana";
changeName(name);
System.out.println(name);
}

static void changeName(String naam) {
    naam = "Kashi"; //creating a new object
}

    static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;

        //this change will only be valid in this function scope only
    }
}
