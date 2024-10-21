//import java.util.Scanner;
//public class Task181 {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        Бұл есептің шарты бойынша бізге бүтін сандар а1 және а50
//        (а₁, а₂, а₃, ..., а₅₀) берілген. Осы сандардың арасынан
//    5-ке бөлінетін сандарды тауып, олардың қосындысын есептеуіміз керек.


//        int n = scanner.nextInt();
//        int k = 0;
//        int count = 0;
//        while ( k < n ) {
//            int a = scanner.nextInt();
//            if (a % 5 == 0) {
//                count = count + a;
//            }
//            k = k + 1;
//        }
//        System.out.println(count);


//b)
//        Есептің шарты бойынша бізге бүтін сандар тізбегі a1...a50 берілген.
//        Осы сандардың арасынан тақ (нечетные) және теріс (отрицательные) сандарды
//        тауып, олардың қосындысын есептеуіміз керек.

//        int n = scanner.nextInt();
//        int k = 0;
//        int count = 0;
//        while ( k < n ) {
//            int a = scanner.nextInt();
//            if (a%2==1 ||  a < 0 ) {
//                count = count + a;
//            }
//            k = k + 1;
//        }
//        System.out.println(count);











//        Шықпаған есеп

//////v)    Есептің шарты бойынша, бізге бүтін сандар тізбегі a1...a50  берілген.
////        Біз осы сандардың арасынан   |ai|<a2  шартын қанағаттандыратын сандарды
////        тауып олардың қосындысын есептеуіміз керек.
//
//        int n = scanner.nextInt();
//        int k = 0;
//        int count = 0;
//        while ( k < n) {
//            int a = scanner.nextInt();
//            if (Math.abs(a) < a * a){
//                count = count + a;
//            }
//            k = k + 1 ;
//        }
//        System.out.println(count);
//
//
//        scanner.close();
//    }
//}