import java.util.Scanner;
public class Star22{
    public static void main(String[] args) {
        Scanner sc22 = new Scanner(System.in);

        System.out.print("Masukkan nilai N = ");
        int N = sc22.nextInt();

        for(int i = 1; i <= N; i++){
            System.out.print("*");
        }
    }
}