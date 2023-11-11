package questionsonloops;
//Java program to print all odd number between 1 and 100 using for loop
public class third_question {
    public static void main (String[] args ) {

     int odd =odd_number();
     System.out.println(odd);

    }
    public static int odd_number()// this is a method
    {
        int n =100;
        System.out.println("all odd number between 1 to 100 ");

        for (int i=0; i<=n; i++) {
            if (i%2==1){
                System.out.println(i);
            }
        }
        return 0;
    }
}
