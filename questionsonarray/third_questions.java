package questionsonarray;
//Java Program to count total number of even and odd elements in an array.
public class third_questions {
    public static void main(String[] args) {

        int[] arg = {2,3,4,5,7};
        int count1 = 0, count2 = 0;
        for (int j : arg) {
            if (j % 2 == 0) {
                count1++;
            } else {
                count2++;
            }
        }
        System.out.println("even   "+ count1);
        System.out.println("odd " +count2);

    }
}