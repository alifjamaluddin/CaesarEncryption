/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caesarencryption;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Alif
 */
import java.util.Scanner;
public class CaesarEncryption {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
      
        int option = 0;
        
        System.out.println("Please insert you text");
        String text = input.nextLine();
        System.out.println("Please insert your shift key");
        int shiftkey=input.nextInt();
        System.out.println("Insert [1] Encryption [2] Decryption");
        option=input.nextInt();
        
        int[] numA = new int[text.length()];
        
        
        
        //get num for every letter in text and store it in int array
        for(int i = 0;  i < numA.length;i++ ){
            char chartemp = text.charAt(i);
            numA[i] =  Character.getNumericValue(chartemp)-10;
           // System.out.println(chartemp + " = "+numA[i]);
        }
        
       
        
        switch(option){
            case 1:  CaesarEncryption.encryption(shiftkey,numA);break;
            case 2:  CaesarEncryption.decryption(shiftkey,numA);break;
            default: System.out.println("Wrong input");
        }
     
        
    }
    
    static void encryption(int key, int[] text){
        String letter = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int[] encnum = new int[text.length];
        char[] encytext = new char[text.length];
        System.out.println("Encryption");
        for(int a=0; a<text.length;a++){
            
            encnum[a] = (text[a] + key)%26;
            encytext[a] = letter.charAt(encnum[a]);
            System.out.print(encytext[a]);   
        }
        System.out.println("");
    }
    
    static void decryption(int key, int[] text){
        String letter = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int[] encnum = new int[text.length];
        char[] encytext = new char[text.length];
        System.out.println("Decryption");
        for(int a=0; a<text.length;a++){
            encnum[a] = (text[a] - key)%26;
            if(encnum[a]<0) encnum[a]+=26;
            encytext[a] = letter.charAt(encnum[a]);
            System.out.print(encytext[a]);  
        }
        System.out.println("");
    }  
}
