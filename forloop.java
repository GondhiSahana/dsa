import java.util.Scanner;
public class forloop {
    public static void main(String[] args){

        /* print numbers from 1 to 5 */
        //for(int num = 1; num <= 5; num +=1){
         //   System.out.println(num);


        /* print numbers from 1 to n*/
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            for(int num = 1; num <= n; num += 1){
               System.out.print(num + " ");
            }
        }

    }
    

