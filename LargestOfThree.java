import java.util.Scanner;
public class LargestOfThree {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();


        /*Approach -1 */
     //   int max = a;
     //   if(b > max){
     //       max = b;
     //   }
     //   if(c > max){
     //       max = c;
    //    }
     //   System.out.println(max);


     /*Approach-2*/

    // int max = 0;
    // if(a > b){
    //    max = a;
    // }else{
    //     max = b;
    // }
    // if(c > max){
     //   max = c;
    // }
    // System.out.println(max);


    /*Approach-3*/
        /*Using Math.max:- Math is a class present in java.lang package & max is a function 
        present in it which takes two number as an argument & return maximum out of them*/

        int max = Math.max(c,Math.max(a,b));
        System.out.println(max);
    }
    
}
