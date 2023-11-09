package questionsonarray;

import java.util.Scanner;

public class first_questions {

    public static void main (String[] args) {


        int n;
        Scanner num = new Scanner(System.in);
        System.out.println("enter the number");
        n=num.nextInt();
        int[] array = new int[10];
        for (int i=0 ; i<n; i++){
             array[i]= num.nextInt();
        }
         System.out.println("element which are stored in array");
        for (int i=0; i<n; i++)
        {
            System.out.println("element are "+array[i]);
        }

    }

}