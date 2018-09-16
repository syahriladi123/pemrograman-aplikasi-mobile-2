/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author syahril adi putra k
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // PERCABANGAN
      //  char gender = 'S';
      //if (gender == 'L' || gender == 'l' || gender == 'M' || gender == 'm'){
      //      System.out.println("Laki-laki");
      //      }
      //  else if (gender == 'P' || gender == 'p' || gender == 'F' || gender == 'f'){
      //      System.out.println("Perempuan");
      //     }
      //  else {
      //      System.out.println("Mohon Maaf Gender Tidak Valid");
      //      }
      //      System.out.println("SELESAI");
      
//      int usia = 21;
//      String paras = "cantik.seksi.pintar.soleha ";
//      if (usia >= 20 && paras == "cantik.seksi.pintar.soleha"){
//            System.out.println("Saya Mau Banget Menikah");
//      }
//      else {
//            System.out.println("Saya Belum Mau Menikah");
//      }
//            System.out.println("Semoga Jadi Keluarga Yang Bahagia");
//
            
            //TUGAS2 PERSYARATAN MENIKAH
            int nilaiAndroid = 85;
            String paras = "cantik";
            String asal  = "malang";
           
                System.out.println("Apakah saya mau menikah?");
            
            char nilaiAndroidhuruf;         
            if( nilaiAndroid >= 85){
               nilaiAndroidhuruf = 'A';
               }
            else if (nilaiAndroid >= 75 ){
               nilaiAndroidhuruf = 'B';
               }
            else if( nilaiAndroid >= 65){
               nilaiAndroidhuruf = 'C';
               }
            else if (nilaiAndroid >= 55){
               nilaiAndroidhuruf = 'D';
               }
            else{
                nilaiAndroidhuruf = 'E';
               }
            if( nilaiAndroidhuruf =='A' && paras == "cantik" && asal == "malang"){
                  System.out.println("jelas saya mau");
               }
            else if  ((nilaiAndroidhuruf == 'A' || nilaiAndroidhuruf == 'C' ) && paras == "cantik" && asal == "malang"){
                  System.out.println("boleh lah");
               }
            else {
                 if(asal == "malang"){
                  System.out.println("saya pikir-pikir dulu");
                   }
                 else{
                  System.out.println("jelas tidak mau");
               }
    }       
}           
}