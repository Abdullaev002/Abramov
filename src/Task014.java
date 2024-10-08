import java.util.Scanner;

public class Task014 {
    public static void main(String[]args){

        Scanner scanner =  new Scanner(System.in);
/////////////////////////////////////////////////////////////
//          F - екі дене арасындағы тартылыс күш (Нюьтон)
//          G - Тартылыс Тұрақтысы  G≈6.674*10....
//          r - Екі дене арасындағы қашықтық
//          m1 және m2 - денелердің массалары
// ///////////////////////////////////////////////////////////

        double m1 = scanner.nextDouble();

        double m2 = scanner.nextDouble();

        double r = scanner.nextDouble();

        double G;

        G = 6.674 * Math.pow(10, -11);

        double F;

        F =G*((m1 * m2)/(r*r));

        System.out.println(F);

        scanner.close();


    }
}
// ///////////////////////////////////////////////////////////
//        Бір-бірінен r қашықтықта орналасқан массасы
//        m 1 және m 2 денелер арасындағы F тартылыс
//        күшін анықтаңыз.
// ///////////////////////////////////////////////////////////