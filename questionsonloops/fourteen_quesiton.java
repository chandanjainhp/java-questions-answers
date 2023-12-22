package questionsonloops;

import java.util.Scanner;
// program to print sum of all even numbers between 1 to n using for loop.
public class fourteen_quesiton {

    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner num = new Scanner(System.in);
        int n = num.nextInt();
        for (int i = 2; i <n ; i++) {
              if (i%2!=0){
                  System.out.println(i);
        }
        }
    }


}