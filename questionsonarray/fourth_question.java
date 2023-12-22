package questionsonarray;

import java.util.Scanner;

//Java Program to count total number of negative elements in an array.
public class fourth_question {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size = scanner.nextInt();
        int[] numbers = new int[size];
        int negativeCount = 0;
        System.out.println("Enter the array elements:");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
            if (numbers[i] < 0) {
                negativeCount++;
            }
        }
        System.out.println("Number of negative elements: " + negativeCount);

    }
}