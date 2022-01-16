public class Scope {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        String name = "Sahana";

        //block scope
        {
           // int a = 119; // already initialised outside the block in the same method, hence u cannot initialse again
            a = 88; //but u can modify the value
            System.out.println(a);
            int c = 90;
            name = "kashi";
            System.out.println(name);
            //values initialized in this block, will remain in block
        }
        System.out.println(a);
        System.out.println(name);
  //System.out.println(c); // cannot used outside the block


  //scoping in for loop
  for(int i = 0; i < 4; i++) {
 //     System.out.println(i);
      int num = 119;
       a = 19;
  }
  System.out.println(a);

    }
    static void random(int marks) {
        int num = 119;
        System.out.println(num);
        System.out.println(marks);
    }
}
