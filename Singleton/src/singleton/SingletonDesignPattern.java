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
public class SingletonDesignPattern {
    
    public static SingletonDesignPattern instance = new SingletonDesignPattern();
    
    private SingletonDesignPattern(){
        
    }
    
    public static SingletonDesignPattern getBean(){
        return instance;
    }
    
    public void showMessage(){
        System.out.println("Hey you got me!");
    }
    
}
