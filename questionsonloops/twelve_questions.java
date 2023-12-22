package questionsonloops;
// Java program to find sum of all prime numbers between 1 to n using for loop.
public class twelve_questions {

        public  static void main(String[] args)
        {
            int sum=0;
            for (int i = 2; i <=100 ; i++) {
                int flag=0;
                for (int j = 2; j <=i/2 ; j++) {
                    if (i%j == 0) {
                        flag = 1;
                        break;
                    }
                }
                if (flag==0){
                    sum =sum+i;
                }

            }

            System.out.println(sum);
        }


    }


