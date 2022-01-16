import java.util.Scanner;
import java.util.Arrays;
public class ArrayInput {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
    
        // array of primitives
        int[] arr = new int[5];
        arr[0] = 24;
        arr[1] = 19;
        arr[2] = 11;
        arr[3] = 119;
        arr[4] = 12;
        // internally smtng stored like this [24, 19, 11, 119, 12]
        System.out.println(arr[3]);

        //input using for loops
 //       for(int i=0; i<arr.length; i++){
   //         arr[i] = in.nextInt();
     //   }

       // System.out.println(Arrays.toString(arr));
    
    //    for(int i=0; i<arr.length; i++){
    //        System.out.println(arr[i] + " ");
  //      }

        //enhanced for loop
   //     for(int num : arr) {// for every element in the
     //       System.out.print(num + " ");//here num represents the element of the array
       // }

 //      System.out.println(arr[5] + " "); // [ArrayIndexOutOfException] index out of bound error


        //array of objects
        String[] str = new String[4];
        for(int i = 0; i<str.length; i++) {
            str[i] = in.next();
        }

        System.out.println(Arrays.toString(str));

        //modify
        str[1] = "sahana";
        System.out.println(Arrays.toString(str));

        str[2] = "kashi";
        System.out.println(Arrays.toString(str));

    }
    
}
