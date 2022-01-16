import java.util.Scanner;

public class CommissionPercent {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the no of sales: ");
        int sales = in.nextInt();
        System.out.println("Enter the commission percentage: ");
        int comm = in.nextInt();
        System.out.println("Enter the num of commission rates: ");
        int rates = in.nextInt();
        System.out.println("Enter the commission rates: ");
        int[] ratesArray = new int[rates];
        for(int i=0; i<rates; i++)
        {
            ratesArray[i] = in.nextInt();
        }
        //calculate commission
        int commission = 0;
        for(int i=0; i<rates; i++){
            if(sales >= ratesArray[i]) {
                commission += (sales*comm/100);
            }
        }
        System.out.println("The commission is: " + commission);
        in.close();
    }
}
