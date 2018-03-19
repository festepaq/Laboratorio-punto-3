/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import java.util.ArrayList;
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
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
    
        Universe u_1= new Universe();
        u_1.agregarPesona("male", "Farid");
        u_1.agregarPesona("female", "Maria");
        u_1.agregarPesona("male", "Jose");
        u_1.agregarPesona("female", "Sofia");
        u_1.agregarPesona("female","Lola");
        
    //Se le asignan los padres a Farid    
     u_1.addParents("Farid",u_1.getPerson(1),u_1.getPerson(2));
     
     // Se le asigna solo 1 parents a Sofia
u_1.addParents("Sofia", u_1.getPerson(3),null);
    
//Ingresar 2 hijos a Lola
u_1.addChildren("Lola",2);
        
 u_1.listarPeople();
 u_1.contarPersonasConHijas();
        
        
    }
    
}
