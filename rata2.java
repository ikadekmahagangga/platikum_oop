import java.util.Scanner;
import javax.swing.JOptionPane;

public class NilaiRataRata {

    public static void main(String[] args) {
        int jumlahBilangan = 10;
        float[] daftarBilangan = new float[jumlahBilangan];
        float total = 0;
        float rerata, max;
       
        Scanner scanInput = new Scanner(System.in);
       
        System.out.println("Masukkan 10 Bilangan");
        for (int i = 0; i < daftarBilangan.length; i++) {
            System.out.print("Bilangan ke-" + (i+1) + " : ");
            daftarBilangan[i] = scanInput.nextFloat();
            total += daftarBilangan[i];
        }
       
        System.out.println("");
        rerata = total / jumlahBilangan;
        System.out.println("Nilai rata-rata bilangan = " + rerata);
       
        max = daftarBilangan[0];
        for (int i = 1; i < daftarBilangan.length; i++) {
            if(max < daftarBilangan[i])
            {
                max = daftarBilangan[i];
            }
        }
       
        System.out.println("Bilangan terbesar = " + max);
    } 
}