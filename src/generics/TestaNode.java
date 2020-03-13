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
public class TestaNode {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Node<Integer> no1 = new Node();
        no1.setElemento(3);
        
        Node<String> no2 = new Node();
        no2.setElemento("Três");
        
        // TYPE ERROR:::::
        //no1.inserirElemento(no2);
    }
    
}
