/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enumerados;

import java.util.Scanner;

/**
 *
 * @author a1820877
 */
public class Lanchonete {

    public static int menu() {
        int opcao = 0, i = 1, opTipo = 0;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Deseja comida(1) ou bebida(2) ou sair(0)?");
        opTipo = teclado.nextInt();
        
        switch (opTipo) {
            case 1: {
                i = 1;
                for (Comidas c : Comidas.values()) {
                    System.out.println(i + " - " + c.getNome() + " - R$ " + c.getPreco());
                    i++;
                }
                break;
            }
            case 2: {
                i = 6;
                for (Bebidas b : Bebidas.values()) {
                    System.out.println(i + " - " + b.getNome() + " - R$ " + b.getPreco());
                    i++;
                }
            }
            default: {
                return 0;
            }
        }

        System.out.println("Qual o seu pedido?");
        opcao = teclado.nextInt();

        return opcao;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opcao = 0;
        double preco = 0.0;
        
        do {
            opcao = menu();
            switch(opcao) {
                case 1: {
                    
                }
                case 6: {
                    
                }
                case 0: {
                    
                }
            }
        }while(opcao > 0);
    }
    
    
}
