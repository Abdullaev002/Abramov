import java.util.Scanner;
public class Task178 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

// В)       Нешеуі жҰп санныҢ квадраты
        int n = scanner.nextInt();
        int k = 0;

        int count = 0;

        while (k < n) {
            int a = scanner.nextInt();
            if(Math.sqrt(a)%2 == 0){
                count = count +1;
            }
            k=k+1;
        }
        System.out.println(count);


//е)   Жұп реттік нөмірлері бар және тақ сандар болып табылатын сандар


        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();7777777777777
        int k = 0;
        int A = 0;
        while( k < n ){
            int a = scanner.nextInt();
            if(a%2==1){
                A = A + 1;
            }
            k = k+1;
        }
        System.out.println(A);
        System.out.println();

        scanner.close();
    }
}