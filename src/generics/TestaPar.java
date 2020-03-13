/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generics;

/**
 *
 * @author a1820877
 */
public class TestaPar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Par[] pares = new Par[3];
        
        pares[0] = new Par<Integer, Integer>(3,9);
        
        pares[1] = new Par<Integer, Double>(7, 3.5);
        
        pares[2] = new Par<Integer, String>(8, "Oito");
                
        for(int i = 0; i < pares.length; i++) {
           System.out.println("Par[" + i + "]: " + pares[i]);
        }
    }
    
}
