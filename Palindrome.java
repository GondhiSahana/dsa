import java.util.Scanner;

import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
    int num,t,s,rem;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter any number ");
    num = sc.nextInt();
    t=num;
    for(s = 0;num>0;num/=10)
    {
        rem = num % 10;
        s=(s*10) +rem;

    }
    if(s==t)
    System.out.println("True");
    else
    System.out.println("False");
}
}