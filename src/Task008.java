import java.util.Scanner;

      public class Task008 {

        public static void  main(String[]args){

            Scanner scanner = new Scanner (System.in);

             double r = scanner.nextDouble();

             double i = scanner.nextDouble();


             System.out.println(2*i*r*Math.sin(Math.PI/i));


            scanner.close();

    }
}
