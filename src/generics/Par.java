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
public class Par <F, S> {
    private F primeiro;
    private S segundo;
    
    public Par (F primeiro, S segundo) {
        this.primeiro = primeiro;
        this.segundo = segundo;
    }
    
    // primeiro-segundo
    @Override
    public String toString() {
        return primeiro + "-" + segundo;
    }

    /**
     * @return the primeiro
     */
    public F getPrimeiro() {
        return primeiro;
    }

    /**
     * @param primeiro the primeiro to set
     */
    public void setPrimeiro(F primeiro) {
        this.primeiro = primeiro;
    }

    /**
     * @return the segundo
     */
    public S getSegundo() {
        return segundo;
    }

    /**
     * @param segundo the segundo to set
     */
    public void setSegundo(S segundo) {
        this.segundo = segundo;
    }
    
}
