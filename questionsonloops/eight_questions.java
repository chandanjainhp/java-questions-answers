package questionsonloops;

import java.util.Scanner;

// 8 Java program to print the sum of digits of a given number using for loop.
public class eight_questions {

    public static void main(String[] args) {

        Scanner num = new Scanner(System.in);
        System.out.println("enter the digits");
        int  a = num.nextInt();

        int sum=0;
        while(a>0) {
            sum =sum + a%10;
            System.out.println("in side the loop + sum  " +sum);
            a =a/10;
            System.out.println("in side the loop + a    "+a);

        }
        System.out.println("out side the loops + sum "+sum);
        System.out.println("out side the loops + a   "+a);
    }

    }




