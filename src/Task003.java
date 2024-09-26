import java.util.Scanner;

public class Task003 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        //////////////////////////////////////////////////////

        //алу - scanner.nextDouble()

        //    салатын нәрсе   /// коробканың аты = салынатын нәрсе

        //шығару - System.out.println(шығатын нәрсе)

        double b;

        b = scanner.nextDouble();

//
//        double S;
//
//        S=a*a*6;
//
//        double V;
//
//        V=a*a*a;

//        System.out.println(V);

        System.out.println(b*b*b);

        System.out.println(b*b*6);

        //////////////////////////////////////////////////////

        scanner.close();
    }
}
}