import java.util.Scanner;

public class Task037 {

    public static void main(String[]args){

        Scanner scanner = new Scanner(System.in);

//          a, b, c нақты сандары берілген. Бұларды екі еселендіріңіз
//          сандар, егер a > b > c болса және олай болмаса,
//          оларды абсолютті мәндермен ауыстырыңыз.

             double a = scanner.nextDouble();

             double b = scanner.nextDouble();

             double c = scanner.nextDouble();

               if ( a >= b && b >= c ){

                   System.out.println(a*2);

                   System.out.println(b*2);

                   System.out.println(c*2);

               }else {

                   a = Math.abs(a);

                   b = Math.abs(b);

                   c = Math.abs(c);
               }

            scanner.close();
      }
  }
//          a, b, c нақты сандары берілген. Бұларды екі еселендіріңіз
//          сандар, егер a > b > c болса және олай болмаса,
//          оларды абсолютті мәндермен ауыстырыңыз.
