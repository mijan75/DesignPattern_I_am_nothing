/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton;

/**
 *
 * @author mijan
 */
public class Singleton {

    public Singleton() {
        SingletonDesignPattern singleton = SingletonDesignPattern.getBean();
        singleton.showMessage();
    }

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new Singleton();
    }
    
}
