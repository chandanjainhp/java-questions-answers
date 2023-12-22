package questionsonloops;
//10 Java program to check whether a given number is Prime or not using for loop.
public class tenth_questions {

    public static void main (String[] args) {
      int num = 23;
      int count=0;

        for (int i = 1; i<=num; i++) {
                if(num % i==0)  {
                    count++;
                }
        }


        if (count == 2) {
            System.out.println("it is a prime number");
        }else
            System.out.println("it is not prime number");
    }
}
