import java.util.Scanner;
public class cerdashen {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Masukkan Jumlah Peserta Cerdas Cermat : ");
        
        int n = input.nextInt();
        
        String nama[] = new String [n];
        String status[] = new String [n];
        int nilai[] = new int [n];
        for (int i=0; i<n; i++){
            System.out.println("Peserta ke : "+(i+1));
            System.out.print("Nama : ");
            nama[i]=input.next();
            
            System.out.print("Nilai : ");
            nilai[i]=input.nextInt();
            System.out.println(" ");            
            if (nilai[i]<=50){
                status [i] = "Tidak Lulus";
            }else{
                status [i] = "Lulus";
            }
        }        
        System.out.println("DAFTAR NILAI PESERTA LOMBA");
        System.out.println("==========================");
        System.out.println("No   Nama   Nilai   Status");
        
        for(int i=0; i<n; i++){
            System.out.println((i+1)+"  "+nama[i]+"  "+nilai[i]+"  "+status[i]);
        }
    }
}
