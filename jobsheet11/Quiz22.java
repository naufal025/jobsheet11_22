import java.util.Random;
import java.util.Scanner;

public class Quiz22 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc22 = new Scanner(System.in);

         char menu='y'; 
         
         do{ 
         int number = random.nextInt(10) + 1; 
         boolean success = false; 
          do { 
          System.out.print("Tebak angka (1-10): "); 
          int answer = sc22.nextInt(); 
          sc22.nextLine(); 
          success = (answer == number); 
          } while(!success); 
          System.out.print("Apakah Anda ingin mengulang permainan (Y/y)?"); 
          menu = sc22.nextLine().charAt(0); 
         } while(menu=='y' || menu=='Y'); 
    }
}
