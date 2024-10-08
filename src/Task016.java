import java.util.Scanner;

public class Task016 {

    public static void  main(String[]args){

        Scanner scanner = new Scanner (System.in);

        Double r = scanner.nextDouble();

        double A;

        A = Math.PI*r*r;

//        Math.PI = 3.1415;

        System.out.println(A);

        scanner.close();
    }
}
//    Айналасы белгілі. Шеңбердің ауданын табыңыз,
//        осы шеңбермен шектеледі.

////////////////////////////////////////////////////////
//                 r — шеңбердің радиусы,
//                 A — шеңбердің ауданы.
// //////////////////////////////////////////////////////
//        Шеңбердің ауданын табу формула
//        A = Math.PI * r * r;
//////////////////////////////////////////////////////////



