import java.util.Scanner;
public class Sum {
    public static void main(String[] args){
       // sum();

      // int ans = sum2();
      // System.out.println(ans);

      int ans = sum3(20, 30);
      System.out.println(ans);
        
    }
        //Q: take input of 2 numbers and print the sum
      /*  Scanner in = new Scanner(System.in);

        int num1, num2, sum;
        System.out.print("Enter number 1: ");
        num1 = in.nextInt();
        System.out.print("Enter number 2: ");
        num2 = in.nextInt();
        
        sum = num1 + num2;
        System.out.print("The Sum = " +sum);    
    */


    /*FUNCTIONS
        return_type name (arguments) {
            //body
            return statement;
        }
    */


    //pass the value of numbers when you are calling the method in main
       static int sum3(int a, int b) {
           int sum = a + b;
           return sum;
       } 




    //return the value
    static int sum2() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int num1 = in.nextInt();
        System.out.print("Enter number 2: ");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        return sum;

        //{After the return statement block nothing will execute outside the block}
    //    System.out.println("This will never execute"); [bcoz I'm returning the funcn value over here]

    }
    static void sum (){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int num1 = in.nextInt();
        System.out.print("Enter number 2: ");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        System.out.println("The Sum = " +sum);  

    }
    
}
