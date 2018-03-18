/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import main.programacion.Universe;
import main.programacion.Person;
/**
 *
 * @author Farid Estepa
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        Universe u_1= new Universe();
        u_1.agregarPesona("male", "Farid");
        u_1.agregarPesona("female", "Maria");
        u_1.agregarPesona("male", "Jose");
        u_1.agregarPesona("female", "Sofia");
        u_1.agregarPesona("female","Lola");
        
//        u_1.addParents("Farid", );
        
        
        
        
    }
    
}
