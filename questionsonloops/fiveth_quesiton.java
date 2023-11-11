package questionsonloops;
// Java program to print sum of all odd numbers between 1 to n using for loop
public class fiveth_quesiton {
    public static  void main (String[] args) {
        int sum =0;
        int n=10;
        for(int i = 1; i<=n;i++) {
            if (i % 2 == 1) {
                sum = sum + i;
            }
        }
        System.out.println(sum);
    }
}
