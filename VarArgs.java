import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
      //  fun(2, 3, 4, 5, 56, 11, 88, 45, 75, 119);
     // fun();
    // multiple(2, 3, "sahana" , "sanu");
    //  demo(2, 3, 4);
    demo("sahana", "sana");
   // demo(); ambiguity--bcoz vararg parameter-it cannot be empty  
    }

    static void demo(int ...v) {
      System.out.println(Arrays.toString(v));
    }

    static void demo(String ...v) {
      System.out.println(Arrays.toString(v));
    }

    static void multiple (int a, int b, String ...v) {

    }
     static void fun(int ...v) {
         System.out.println(Arrays.toString(v));


     }

    
}
