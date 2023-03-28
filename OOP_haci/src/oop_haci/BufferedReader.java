/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.io        
import java.io.InputStreamReader;
package oop_haci;

/**
 *
 * @author INSTIKI
 */
public class BufferedReader {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException
    {
        // TODO code application logic here
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         String nama, kota; 
         System.out.print("Nama anda : ");
         nama br.readLine();
         System.out.println("kota asal : ");
         kota = br .readLine();
         System.out.println("selamat datang "+ nama + "dari" + kota);
    }
    
}
