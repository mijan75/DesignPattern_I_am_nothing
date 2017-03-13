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
public class FactoryDesign {

    public FactoryDesign() {
        Factory factory = new Factory();
        Shape shape1 = factory.getBean("Triangle");
        Shape shape2 = factory.getBean("Circle");
        
        shape1.draw();
        shape2.draw();
    }

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new FactoryDesign();
    }
    
}
