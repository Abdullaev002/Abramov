import java.util.Scanner;

public class Task009 {
    public static void main (String []args){

        Scanner scanner = new Scanner(System.in);

        double R1 =  scanner.nextDouble();;

        double R2 =  scanner.nextDouble(); ;

        double R3 = scanner.nextDouble();;

        double R = 1/R1+1/R2+1/R3;

        System.out.println(R);

        scanner.close();
    }
}
