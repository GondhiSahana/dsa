public class Arrays {
    public static void main(String[] args){
        //Q: store a roll number
        int a = 19;

        //Q: store a person's name
        String name = "Sana";

        //syntax
        //datatype[] variable_name = new datatype[size];
        
        //store 5 roll numbers:
      //  int[] rnos = new int[5];

        //or directly it can be written as
    //    int[] rnos2 = {24, 11, 119, 14};


        int[] ros; //declaration of array. ros(ref variable) is getting defined in the stack.
        ros = new int[5]; //initialisation: actually here object is being created in the memory(heap)
        
    //    System.out.println(ros[1]);


        String[] arr = new String[4];
        System.out.println(arr[0]);

      //  for(String element : arr) {
        //    System.out.println(element);
        }
    
    }

