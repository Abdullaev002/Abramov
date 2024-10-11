
import java.util.Scanner;

public class Task040 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

//                Екі нақты сан берілген. Алдымен ауыстырыңыз
//                егер ол екіншіден кіші немесе оған тең болса,
//                нөлге тең, ал басқа жағдайда сандарды өзгеріссіз
//                        қалдырыңыз

    double x = scanner.nextDouble();
    double y = scanner.nextDouble();

    boolean condition = x <= y;

    if (condition){
        x=0;
    }

    System.out.println(x);

    scanner.close();

    }
}