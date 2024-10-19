import java.util.Scanner;
 public class Ttt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(n);
        int [] array = new int [n];
        for (int i = 0; i < n; i++ ){
            array [i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (array[i] % 2 == 0 && (array[i] / 2) % 2 != 0){
                System.out.println("q(" + (i + 1) + ") = " + array[i] + " — қос тақ сан.");
            }
        }
        scanner.close();
    }
}






























//
//     //        Нешеуі жҰп санныҢ квадраты
//     int n = scanner.nextInt();
//     int k = 0;
//
//     int count = 0;
//
//        while (k < n) {
//        int a = scanner.nextInt();
//        if(Math.sqrt(a)%2 == 0){
//        count = count +1;
//        }
//        k=k+1;
//        }
//        System.out.println(count);
//        scanner.close();
//        }
//        }
//
//
//


