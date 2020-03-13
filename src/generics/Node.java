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
public class Node <T> {
    private T elemento;
    private Node<T> anterior;
    private Node<T> proximo;
    
    public Node() {
        this.elemento = null;
        this.anterior = null;
        this.proximo = null;
    }
    
    public void inserirElemento(Node<T> elemento) {
        if(this.elemento == null) {
            this.elemento = elemento.elemento;
            return;
        }
        
        if(this.anterior == null && this.proximo == null) {
            this.proximo = elemento;
            this.proximo.anterior = this;
            return;
        }
        
        Node<T> aux = this;
        while(aux.proximo != null)
            aux = aux.proximo;
        
        aux.proximo = elemento;
        aux.proximo.anterior = aux;
    }

    /**
     * @return the elemento
     */
    public T getElemento() {
        return elemento;
    }

    /**
     * @param elemento the elemento to set
     */
    public void setElemento(T elemento) {
        this.elemento = elemento;
    }

    /**
     * @return the anterior
     */
    public Node<T> getAnterior() {
        return anterior;
    }

    /**
     * @param anterior the anterior to set
     */
    public void setAnterior(Node<T> anterior) {
        this.anterior = anterior;
    }

    /**
     * @return the proximo
     */
    public Node<T> getProximo() {
        return proximo;
    }

    /**
     * @param proximo the proximo to set
     */
    public void setProximo(Node<T> proximo) {
        this.proximo = proximo;
    }


    
    
}
