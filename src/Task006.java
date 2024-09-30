import java.util.Scanner;

public class Task006 {

    public static void main (String[]args){

        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextDouble();

        double b = scanner.nextDouble();

      System.out.println(Math.sqrt(a*a+b*b));

        double S ;

        S = 0.5*a*b;

        System.out.println(S);

        scanner.close();
    }
}
//////////////////////////////////////////////////////
//    Тікбұрышты үшбұрыштың катеттері берілген.    //
//        Оның гипотенузасы мен ауданын табу.     //
////////////////////////////////////////////////////