import java.util.Scanner;

        public class Task007 {
           public  static void main (String[]args){

              Scanner scanner = new Scanner (System.in);

//              Алынған Қоспаның көлемі: V=V1+V2
//
//              Алынған Қоспаның темпиратурсы: (V1*T1+V2*T2)/(V1+V2)


               Double V1 = scanner.nextDouble();

               Double V2 = scanner.nextDouble();

               Double T1 = scanner.nextDouble();

               Double T2 = scanner.nextDouble();



              System.out.println(V1+V2);

              System.out.println((V1*T1+V2*T2)/(V1+V2));


    }
}
////////////////////////////////////////////////////////////////////////////
//^ температурадағы Вт литр су t2 температурадағы v2 литр сумен араласады./
//        Көлем мен температураны табыңыз                                /
//        алынған қоспа.                                                /
////////////////////////////////////////////////////////////////////////