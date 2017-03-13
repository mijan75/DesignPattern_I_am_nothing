/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorydesignpattern;

/**
 *
 * @author mijan
 */
public class Factory {
    public Shape getBean(String type){
        if(type == null)
            return null;
        else if(type.equalsIgnoreCase("Triangle"))
            return new Triangle();
        else if(type.equalsIgnoreCase("Circle"))
            return new Circle();
        return null;
    }
}
