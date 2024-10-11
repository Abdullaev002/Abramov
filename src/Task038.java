import java.util.Scanner;

public class Task038 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
/////////////////////////////////////////////////////
//        x, y нақты сандары берілген. z есептеңіз:/
///////////////////////////////////////////////////

        double x = scanner.nextDouble();

        double y = scanner.nextDouble();

        double z ;

        if ( x > y ) {

            z=x-y;

        } else {

            z= y - x + 1;
        }

        System.out.println(z);

        scanner.close();
    }
}
