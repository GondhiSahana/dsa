public class Shadowing {
    static int x = 90; // this will be intialised at line 6
    public static void main(String[] args) {
        System.out.println(x); //
        int x; //the class variable at line 2 is shadowed by this
    //System.out.println(x); // scaope will begin when value is initialised
        x = 90;
        System.out.println(x); //111
        fun();
    }
    static void fun() {
        System.out.println(x);
    }
}
