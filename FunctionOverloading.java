

public class FunctionOverloading {
    public static void main(String[] args) {
  //      fun(11);
  //      fun("sahana");
        int ans = sum(3, 4,  4);
        System.out.println(ans);        

    }

    static int sum(int a, int b) {
        return a + b;
    }

    static int sum(int a, int b, int c) {
        return a + b + c;
    }
    static void fun(int a) {
        System.out.println("first one");
        System.out.println(a);
    }

    static void fun(String name) {
        System.out.println("second one");
        System.out.println(name);
    }
    
}
