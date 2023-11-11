package questionsonloops;

import java.util.Scanner;

// Java program to print multiplication of any number using for loop.
public class sixth_question {
    public static void main (String[] args) {


        Scanner num = new Scanner(System.in);
        System.out.println("enter then number ");
        int multiplication = num.nextInt();
        int n=10;

        for(int i=1;i<=n ; i++) {
            int table = multiplication * i;
            System.out.println(  multiplication +" * "+ i +" = " + table );

        }

    }

}
