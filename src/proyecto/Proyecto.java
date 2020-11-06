/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import java.util.Random;
import java.util.Arrays;

/**
 *
 * @author cloja
 */
public class Proyecto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hola mundo");
        System.out.println("Hola mundo2");
        System.out.println("Holamundo 234439739r8");
        System.out.println("Hola mundo, push #1");
        
        System.out.println("bla bla bla");
  
        int testMatrix[][] = new int[20][10];
        var rd = new Random(24234324l);
       for (int i = 0; i< 20; i++){
           
           for (int j =0; j<10; j++){
               testMatrix[i][j] = rd.nextInt();
           }
       }
       
        System.out.println(Arrays.toString(testMatrix));
    }
    
}
