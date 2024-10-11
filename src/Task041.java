import java.util.Scanner;
public class Task041 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        Үш нақты сан берілген. Олардың арасынан таңдаңыз
//        интервалына жататындар (1, 3).

        double a = scanner.nextDouble();

        double b = scanner.nextDouble();

        double c = scanner.nextDouble();

        if (a >= 1 && a <= 3 ){
            System.out.println("Интервалға жатады)"+a);
        }else {
            System.out.println("Интервалға жатпайды)"+a);
        }
        if (b >= 1 && b<= 3 ){
            System.out.println("Интервалға жатады)"+b);
        }else{
            System.out.println("Интервалға жатпайды)"+b);
        }
        if (a >= c && c <= 3 ){
            System.out.println("Интервалға жатады)"+c);
        }else {
            System.out.println("Интервалға жатпайды)"+c);
        }

        scanner.close();
    }
}
