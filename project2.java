/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package project2;

import java.io.InputStreamReader;
import java.io.*;
/**
 *
 * @author INSTIKI
 */

class Project2{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException
    {
        // TODO code application logic here
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         String nama, kota; 
         System.out.print("Nama anda : ");
         nama = br.readLine();
         System.out.print("kota asal : ");
         kota = br.readLine();
         System.out.println("selamat datang "+ nama + "dari" + kota);
    }
    
}
