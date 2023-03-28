/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package project3;

/**
 *
 * @author INSTIKI
 */
import javax.swing.*;

public class Project3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nama, kota;
        nama = JOptionPane.showInputDialog("Nama anda : ");
        kota = JOptionPane.showInputDialog("Kota anda : ");
        System.out.println( "selamat datang "+ nama + "dari" + kota);
        System.exit (0);
    }
    
}
