import java.util.Scanner;

public class Task005{

    public static void main (String[]args){

        Scanner scanner = new Scanner(System.in);

//        System.out.println((Math.abs(a)+Math.abs(b))/2);
//        System.out.println(Math.sqrt(Math.abs(a)*Math.abs(b)));
//        Арифметик ж/е Геометриялық ортасы модульдер
//        Math.abs Модульдер ортасы
//        Math.sqrt Геометриялық ортасы Тубір


      //////////////////////////////////////////////////////

        double a = scanner.nextDouble();

        double b = scanner.nextDouble();

        System.out.println((Math.abs(a)+Math.abs(b))/2);

        System.out.println(Math.sqrt(Math.abs(a)*Math.abs(b)));

      ///////////////////////////////////////////////////////////
    }
}

//    Екі нақты сан берілген. Орташа мәнді табыңыз
//        осы сандардың арифметикасы және олардың геометриялық ортасы
//        модульдер.