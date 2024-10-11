import java.util.Scanner;

public class Task043 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

//        Үш нақты сан берілген.
//        Мәндері теріс емес болғандарды квадратпен белгілеңіз

        double a = scanner.nextDouble();

        double b = scanner.nextDouble();

        double c = scanner.nextDouble();

        if (a >= 0){

            a = Math.pow(a,2);

        }
        if (b >= 0){

            b = Math.pow(b,2);

        }
        if (c >= 0){

            c = Math.pow(c,2);
        }

        System.out.println(a);

        System.out.println(b);

        System.out.println(c);

        scanner.close();
    }
}

