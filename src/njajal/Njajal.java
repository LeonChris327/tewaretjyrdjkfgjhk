
package njajal;

import java.util.Scanner;


public class Njajal {

   
    
    public static void main(String[] args) {
      
        int  x = 1;
        Scanner keyboard = new Scanner (System.in);
        while(x <= 10) {
            System.out.println(x);
            ++x;
        }
        
       
          int y; 
        System.out.print("Masukkan nilai Matematika anda:  ");
        y = keyboard.nextInt();
       
        switch(y) {                                                                //Switch Case
            case 1:
                System.out.println("Tolol"); break;
                case 2:
                System.out.println("Tolol"); break;
                case 3:
                System.out.println("Tolol"); break;
                case 4:
                System.out.println("Tolol"); break;
                case 5:
                System.out.println("Kurang"); break;
                case 6:
                System.out.println("Kurang"); break;
                case 7:
                System.out.println("Hampir"); break;
                case 8:
                System.out.println("Lumayan"); break;
                case 9:
                System.out.println("Lumayan"); break;
                case 10:
                System.out.println("Perfecto"); break;
                default: System.out.println("Error");           
       
         int z;                                                                   //if else
         System.out.println("Masukkan nilai UAS anda:  ");
         z = keyboard.nextInt();
         
         if (z >= 100) {
         System.out.println("Anda dinyatakan LULUS!");
         }
         else if (z >= 80) {
         System.out.println("Anda dinyatakan LULUS!");
         }
         else if (z >= 0) {
         System.out.println("Silahkan mengikuti remedial");
         }
        
         
        
        
       
        }}}
    
    
