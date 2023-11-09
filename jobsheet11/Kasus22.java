import java.util.Scanner;

public class Kasus22 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.print("Masukkan ukuran sisi persegi: ");
    int size = input.nextInt();
    
    for (int i = 1; i <= size; i++) {
      for (int j = 1; j <= size; j++) {
        if (i == 1 || i == size || j == 1 || j == size) {
          System.out.print("*"); // cetak bintang untuk sisi
        } else {
          System.out.print(" "); // cetak spasi untuk bagian dalam
        }
      }
      System.out.println(); // pindah baris setelah setiap baris selesai
    }
    
    input.close();
  }
}