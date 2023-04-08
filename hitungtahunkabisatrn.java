import java.util.Scanner;

public class HitungTahunKabisat {

    public static void main(String[] args) {
        int tahun;
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan tahun (1900-2005) : ");
        tahun = scan.nextInt();
        if(tahun<1900){
          System.out.println("Maaf, Tahun Input Diatas 2005");
        }else if(tahun>2005){
          System.out.println("Maaf, Tahun Input Diatas 2005");
        }else if (tahun % 400 == 0) {
          System.out.print(tahun + " Merupakan Tahun Kabisat\n");
        } else if (tahun % 100 == 0) {
          System.out.print(tahun + " Bukan Tahun Kabisat\n");
        } else if (tahun % 4 == 0) {
          System.out.print(tahun + " Merupakan Tahun Kabisat\n");
        } else {
          System.out.print(tahun + " Bukan Tahun Kabisat\n");
        }
    }
    
}