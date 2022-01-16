import java.util.ArrayList;
import java.util.Scanner;
public class ArrayListExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Syntax
    ArrayList<Integer> list = new ArrayList<>();
/*
        list.add(11);
        list.add(19);
        list.add(234);
        list.add(678);
        list.add(221);
        list.add(119);


        System.out.println(list.contains(789));

        list.set(2,911);

        list.remove(3);


        System.out.println(list);
*/
        //input
        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());
        }

        //get item at any index
        for (int i = 0; i < 5; i++){
         System.out.println(list.get(i)); //pass index here,list[index] synatax will not working
        }
    System.out.println(list);
    }    

}
