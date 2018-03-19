/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.programacion;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Farid Estepa
 */
public class Universe {
private ArrayList<Person> people;
Scanner teclado= new Scanner(System.in);

    public Universe() {
this.people= new ArrayList<>();
       }

public void agregarPesona(String gender, String name){
Person p_prueba= new Person(gender,name);    
this.people.add(p_prueba);
}

public void addParents(String name,Person parent_1, Person parent_2){
    Person [] arr= {parent_1,parent_2};
    for (int i = 0; i < people.size(); i++) {
    if(this.people.get(i).getName()== name){
    this.people.get(i).setParents(arr);
    } 
    }  
}

public Person  getPerson(int number){
return this.people.get(number);
}

public void addChildren(String name,int num){
    System.out.println("Se van a ingresar hijos");
    
    for (int i = 0; i < people.size(); i++) {
       
    if(this.people.get(i).getName()== name){
        for(int j = 0; j<num; j++){ 
   
        System.out.println("Ingrese nombre");
                String a= teclado.next();
    for(int h=0; 0< people.size();h++){  
    ArrayList<Person> chi= new ArrayList<Person>();    
    if(this.people.get(h).getName()==a){          
    chi.add(this.people.get(h));
        }
    this.people.get(i).setChildren(chi);
    } 
    }}  }
}

    

    public void setPeople(ArrayList<Person> people) {
        this.people = people;
    }


public ArrayList<Person> listarPeople (){
return this.people;    
}

public void contarPersonasConHijas(){
int contador=0;
    for(int i=0; i< people.size();i++){
if(this.people.get(i).getChildren().get(i).getGender()=="female"){
  contador++;
    }    
}
    System.out.println("Personas con hijas:"+contador);
}


}
