import java.util.Scanner;
public class Task046 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        x, y нақты сандары берілген. Егер х және у теріс болса,
//        онда әрбір мәнді оның модулімен ауыстырыңыз;
//        егер олардың біреуі ғана теріс болса, онда екі мән де
//        0,5 ұлғайту; егер екі мән де теріс емес және екеуі де болмаса
//        олардың біреуі [0,5, 2,0] интервалына жатпайды, онда екеуі де
//        Мәндерді 10 есе азайтыңыз; басқа жағдайларда x және y
//        өзгеріссіз қалдырыңыз.

        double x = scanner.nextDouble();
        double y = scanner.nextDouble();

        x = Math.abs(x);
        y = Math.abs(y);





        System.out.println(x);
        System.out.println(y);



            scanner.close();
    }
}
