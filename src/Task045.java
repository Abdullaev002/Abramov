import java.util.Scanner;

public class Task045 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

//        a, b, c, d нақты сандары берілген. Егер a <b <c <d болса,
//        әрбір санды ең үлкенімен ауыстырыңыз олар; егер a > b > c > d,
//        онда сандарды өзгеріссіз қалдырыңыз; әйтпесе, барлық сандар
//        олардың квадраттарымен ауыстырылады.

        double a = scanner.nextDouble();

        double b = scanner.nextDouble();

        double c = scanner.nextDouble();

        double d = scanner.nextDouble();

        if (a < b && b < c && c < d ){
           a = d;

           b = d;

           c = d;

           d = d;

        }else if  ( a > b && b > c && c > d ){

//            System.out.println();
        }
        else{

           a = Math.pow(a, 2);

           b = Math.pow(b, 2);

           c = Math.pow(c, 2);

           d = Math.pow(d, 2);
        }
           System.out.println(a);

           System.out.println(b);

           System.out.println(c);

           System.out.println(d);

        scanner.close();
    }
}
