import java.util.Scanner;
public class Task182 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        Натурал n саны берілген, a1..., аn бүтін сандары.
//        Осы қатардың 5-ке бөлінетін және 7-ге бөлінбейтін
//        мүшелерінің санын және қосындысын табыңыз.

        int n = scanner.nextInt();
        int k = 0;
        int count = 0;
        int sum = 0;
        while( k < n ){
            int a = scanner.nextInt();
            if (a % 5 == 0 && a % 7 != 0){
                count = count + 1;
                sum = sum + a;

            }
            k = k + 1;
        }
        System.out.println(count);
        System.out.println(sum);
        scanner.close();
    }
}
