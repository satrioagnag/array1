/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package punyakelasc;
import java.util.Scanner;
/**
 *
 * @author Lenovo
 */
public class PunyakelasC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int nilai[], NPM[], Size, pilih,pilih2, npm,indeks,sizeString;
        String Nama[];
        
        System.out.print("Masukkan jumlah Mahasiswa : ");
        Size = s.nextInt();
        nilai = new int [Size];
        NPM = new int [Size];
        Nama = new String [Size];
        sizeString = Nama.length;
        for (int i = 0; i < Size; i++) {
            System.out.print("Masukkan Nama Anda : ");
            Nama[i] = s.next();
            System.out.print("Masukkan NPM Anda(3 digit terakhir) : ");
            NPM[i] = s.nextInt();
            System.out.print("Input Nilai = ");
            nilai[i]=s.nextInt();
            System.out.println(" ");
        }
        System.out.println(" ");
        for (int i = 0; i < Size; i++){
            System.out.println("Daftar Nilai " + Nama[i]);
            System.out.println("NPM : " + NPM[i]);
            System.out.println((i+1) + ". "+nilai[i]);
            System.out.println(" ");
        }
        boolean ketemu=false;
        do{
System.out.println(" ");
System.out.println("Cari NPM");
System.out.println("1. Ya\n2. Tidak");
System.out.print("Pilih = ");
pilih = s.nextInt();

if(pilih==1){
    System.out.print("Masukkan NPM = ");
    npm = s.nextInt();
    for (int i=0; i<NPM.length; i++) {
        if(npm==NPM[i]){
        ketemu=true;
        break;
            }
        }
    if(ketemu) //ketemu bernilai true
    System.out.println("NPM Ada");
    else
    System.out.println("NPM Tdk Ada");
    }
ketemu=false;
        }
while(pilih!=2);


System.out.print("\nHapus Indeks = ");
        indeks = s.nextInt();
        for (int i = indeks; i < NPM.length-1; i++) {
            NPM[i] = NPM [i+1];}
        NPM[NPM.length-1]=0;
        for (int i = indeks; i < nilai.length-1; i++) {
            nilai[i] = nilai [i+1];}
        nilai[nilai.length-1]=0;
        for (int i = indeks; i < sizeString; i++) {
            Nama[i] = Nama [i+1];}
        Nama[sizeString-1]= "blank";
            
        
        System.out.println("Hasilnya : ");
        for (int i = 0; i < NPM.length; i++) {
            System.out.println("Nama : " + Nama[i]);
            System.out.println("NPM : " + NPM[i]+ " "); 
            System.out.println("Nilai : " + nilai[i]+ " ");
    }
}
}

    
