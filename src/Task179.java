import java.util.Scanner;

public class Task179 {

    public static void main(String[] args) {

        Scanner scanner  = new Scanner(System.in);
//        n, q1, ..., qn натурал сандары берілген. Табу
//        q1, ..., qn қатарының q(i) мүшелері бұл
//        а) қос тақ сандар;
//a)
        int n = scanner.nextInt();
        int k = 0;
        while ( k < n ) {
            int a = scanner.nextInt();
            if (a/2%2==1   ){
                System.out.println();
            }
            k = k + 1;
        }



//b)
//        int n = scanner.nextInt();
//        int k = 0;
//        int count = 0;
//        while (k < n) {
//            int a = scanner.nextInt();
//            if ( a%7==1 || a%7==2 || a%7==5){
//                count = count + 1;
//            }
//            k = k + 1;
//        }
//        System.out.println(count);
        scanner.close();
    }
}