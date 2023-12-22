package questionsonloops;

import java.util.Scanner;

//Java program to check a given number is Armstrong or not using for loop.
public class thirteen_question {


    public static void main (String[] args) {
        Scanner armstrong = new Scanner(System.in);
        System.out.println("enter the number");
        int i = armstrong.nextInt();
        int arm=0, sum;
        while (i>0){
             sum= i%10;
            arm=(sum*sum*sum)+arm;
             i = i/10;

                      }
        if (arm == i) {
            System.out.println("this is an Armstrong number");
        }
        else {
            System.out.println("this is not a Armstrong number");
        }
    }

}
