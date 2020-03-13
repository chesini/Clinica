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
public enum Comidas {
    CACHORRO_QUENTE("CACHORRO QUENTE", 7.80),
    X_SALADA("CHEESE SALADA", 8.90),
    X_BURGER("XISBURG", 7.9),
    SALADA("SALADA", 15.9),
    FRITAS("BATATA FRITA", 16.5);
    
    private String nome;
    private double preco;
    
    Comidas(String nome, Double preco) {
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
