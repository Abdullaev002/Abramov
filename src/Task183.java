import java.util.Scanner;
public class Task183 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        Берілген натурал сандар n, p бүтін сандар
//        a1..., an. a1, тізбегі мүшелерінің көбейтіндісін
//        алыңыз. . . an, еселік p.

        int n = scanner.nextInt();

        int p = scanner.nextInt();

        int k = 0;

        int count = 0;

        while( k < n ){
            int a  = scanner.nextInt();

            if (a % 2 == 1){

                count = count + 1;

            }
            k = k + 1;
        }

        System.out.println(count);


        scanner.close();
    }
}