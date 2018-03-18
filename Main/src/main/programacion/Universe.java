/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.programacion;

import java.util.ArrayList;

/**
 *
 * @author Farid Estepa
 */
public class Universe {
private ArrayList<Person> people;

    public Universe() {
this.people= new ArrayList<>();
       }

public void agregarPesona(String gender, String name){
Person p_prueba= new Person(gender,name);    
this.people.add(p_prueba);
}

public void addParents(String name,Person[] parents){
    for (int i = 0; i < people.size(); i++) {
    if(this.people.get(i).getName()== name){
    this.people.get(i).setParents(parents);
    } 
    }  
}

public void addChildren(String name,ArrayList<Person> children){
    for (int i = 0; i < people.size(); i++) {
    if(this.people.get(i).getName()== name){
    this.people.get(i).setChildren(children);
    } 
    }  
}


public ArrayList<Person> listarPeople (){
return this.people;    
}




}
