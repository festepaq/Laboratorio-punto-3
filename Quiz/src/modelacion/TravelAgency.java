/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelacion;

import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author Farid Estepa
 */
public class TravelAgency {
private String name;
private Airport[] airports;
private Hotel[] knownHoteles;
private Travel[] offeredTravels;


public TravelAgency(String name) {
 this.name= name;       
 this.airports= new Airport[4];
 this.knownHoteles =    new Hotel[5];
 this.offeredTravels = new Travel[10];      
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//
//public void asignarHotel(String a, String b){
//this.knownHoteles[0]= new Hotel(a,b)  ;  
//}
//public void asignarOutBound(int FligtNumber, String departure, String arrival){
//    
//}

public boolean asignarTravel(String lugar,String start, int duration,int fligtNumber, 
        String departure, String departure_2, int flightNumber_2, String arrival,
        String arrival_2, Airport from, Airport from_2, Airport to, Airport to_2, Hotel hotel){
  
    for (int i = 0; i < 10; i++) {
if ( this.offeredTravels[i]==null){
    this.offeredTravels[i]= new Travel (lugar,start, duration);
    offeredTravels[i].designarOutBound( fligtNumber,  departure,  arrival, from, to);
    offeredTravels[i].designarReturns( flightNumber_2,  departure_2,  arrival_2, from_2, to_2);
    offeredTravels[i].designarHotel(hotel);
    return true;
} else {
}
}  
    return false;
}

public void listarViajesOfrecidos(){
    for (int i = 0; i < 10; i++) {
    
        System.out.println("La agencia " + getName() +" ofrece un viaje de " 
                +offeredTravels[i].getDuration() +" dias a "+ offeredTravels[i].getLugar()+", al hotel "+ 
                offeredTravels[i].getHotel().getNombre()+ ". \n El viaje empieza el "+ 
                        offeredTravels[i].getStart()+". El vuelo de partida es el "+ offeredTravels[i].getOutbound().getArrival()+
                ". Numero de vuelo salida :" + offeredTravels[i].getOutbound().getFlightNumber() + ". Aeropuerto Salida: "+offeredTravels[i].getOutbound().getFrom().getDescription()+". Aeropuerto llegada: "
                + offeredTravels[i].getOutbound().getTo().getDescription()+"\n"+"... Retorno: El regreso es el día "+offeredTravels[i].getReturns().getDeparture()  +". Vuelo numero: "+ 
                offeredTravels[i].getReturns().getFlightNumber()+ ". Aeropuerto salida: "+ 
                offeredTravels[i].getReturns().getFrom().getDescription()+ ". Aeroppuerto llegada: " + offeredTravels[i].getReturns().getTo().getDescription()+"\n"
        );
        
    }
    
}
public void listarViajesPorDuracion(){
int lista[] = new int[10];
    for (int i = 0; i < offeredTravels.length; i++) {

lista[i]= this.offeredTravels[i].getDuration(); 
   for(int j=i+1; j<10;j++){
   if(lista[i]<lista[j]){
  int aux= lista[i];
  lista[j]=lista[i];
  lista[j]=aux;  
   }    
   }
       }
    System.out.println("Duraciones: ");  
  for(int i=0;i<10;i++){
      System.out.print(lista[i]+", ");    
  }  
}


    public Airport[] getAirports() {
        return airports;
    }

    public void setAirports(Airport[] airports) {
        this.airports = airports;
    }

    public Hotel[] getKnownHoteles() {
        return knownHoteles;
    }

    public void setKnownHoteles(Hotel[] knownHoteles) {
        this.knownHoteles = knownHoteles;
    }

    public Travel[] getOfferedTravels() {
        return offeredTravels;
    }

    
    public void setOfferedTravels(Travel[] offeredTravels) {
        this.offeredTravels = offeredTravels;
    }

//public boolean agregarHotel(Hotel hotel){
//    for (int i = 0; i < 10; i++) {
//if(this.knownHoteles[i]==null){
//            System.out.println("Hola");
//       
//    for (int j = 1; j < 10; j++) {
//String n= this.knownHoteles[j].getNombre();
//String m= hotel.getNombre();
//
//if (!n.equalsIgnoreCase(m)){
//  this.knownHoteles[i]= hotel;  
// System.out.println("Hla");
// 
// }        
//}}
//    
//
//}
//return false;}


public void asignarAeropuerto(String a){
this.airports[0]= new Airport(a);    
}
}
