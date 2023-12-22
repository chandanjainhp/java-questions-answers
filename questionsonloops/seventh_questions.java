package questionsonloops;

import java.util.ArrayList;
import java.util.Scanner;

//Java program to count the digits of a given number using for loop.
public class seventh_questions {

   public  static  void main (String[] args) {


   Scanner num = new Scanner(System.in);
   System.out.println("enter the number");
   int n = num.nextInt();
   int count =0;
   while( n>0) {
       n=n/10;
       count++;

   }
   System.out.println("the number are :" +count);
   }

}
