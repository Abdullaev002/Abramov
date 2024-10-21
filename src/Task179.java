import java.util.Scanner;

public class Task179 {

    public static void main(String[] args) {

        Scanner scanner  = new Scanner(System.in);

//        n, q1, ..., qn натурал сандары берілген. Табу
//        q1, ..., qn қатарының q(i) мүшелері бұл
//        а) қос тақ сандар;
//a)

//        int n = scanner.nextInt();
//        int k = 0;
//        while ( k < n ) {
//            int a = scanner.nextInt();
//            if (a/2%2==1   ){
//                System.out.println(a);
//            }
//            k = k + 1;
//        }

//b)
//        n, q 1, ..., qn натурал сандары берілген. Табу
//        q1, ..., qn қатарының q(i ) мүшелері.
//        7-ге бөлгенде қалдық 1, 2 немесе 5;

        int n = scanner.nextInt();
        int k = 0;

        while (k < n) {
            int a = scanner.nextInt();
            if ( a%7==1 || a%7==2 || a%7==5){
                System.out.println(a);
            }
            k = k + 1;
        }
        scanner.close();
    }
}