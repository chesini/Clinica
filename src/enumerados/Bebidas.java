/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enumerados;

/**
 *
 * @author a1820877
 */
public enum Bebidas {
    COCA_COLA("COQUINHA GELADA", 4.50),
    SUCO_LARANJA("SUCO DE LARANJA", 6.00),
    SUCO_POLPA("SUCO DE POLPA", 5.00),
    CAIPIRA("CAIPIRINHA", 15.5);
    
    private String nome;
    private double preco;
    
    Bebidas(String nome, Double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @return the preco
     */
    public double getPreco() {
        return preco;
    }
    
    
}
