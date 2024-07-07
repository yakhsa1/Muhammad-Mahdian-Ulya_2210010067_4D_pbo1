
package uas_2210010067;
import java.util.Scanner;
// inhiritance warisan //
public class OjekBeraksi {
    public static void main(String[]args){
      
    //error handling//
    try{
        //inp autp sederhana
        Scanner scanner = new Scanner (System.in);
        
        //array
        OjekPro[] ojek = new OjekPro[2];
        //perulangan sederhana
        for(int i=0; i<ojek.length; i++){
            System.out.print("Masukkan Nama Ojek "+(i+1)+": ");
            String nama = scanner.nextLine();
            System.out.print("Masukkan ID "+(i+1)+":");
            String id = scanner.nextLine();
            System.out.print("Masukkan Tujuan "+(i+1)+":");
            String tujuan = scanner.nextLine();
            scanner.nextLine();
            System.out.println("--------------------------");
        
            ojek[i] = new OjekPro (nama, id, tujuan);
        }
    //perulangan
    for (OjekPro data: ojek){
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        System.out.println("Data Ojek");
        System.out.println(data.info());
    }
    //error handle
    }catch (NumberFormatException e){
        System.out.println("Kesalahan Format Nomor ="+e.getMessage());
    }catch (StringIndexOutOfBoundsException e){
        System.out.println("Kesalahan format Id ="+e.getMessage());
    
    }catch (Exception e){
        System.out.println("Kesalahan Error ="+e.getMessage());
    
}
    }
}