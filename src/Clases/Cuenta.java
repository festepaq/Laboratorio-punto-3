/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;
import java.util.Date;
/**
 *
 * @author Parra G
 */
public class Cuenta {
    private int numeroCuenta;
    private double saldoCuenta;
    private java.util.Date fechaCreacion = new Date();
    private String nombreCliente;
    private Movimiento mov = new Movimiento( this.saldoCuenta);
    
    public Cuenta(int numeroCuenta, double saldoCuenta, String nombreCliente) {
        this.numeroCuenta = numeroCuenta;
        this.saldoCuenta = saldoCuenta;
        this.nombreCliente = nombreCliente;
    }
    public String Cuenta (){
        return this.Cuenta();
    }
    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public double getSaldoCuenta() {
        return saldoCuenta;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public void setSaldoCuenta(double saldoCuenta) {
        this.saldoCuenta = saldoCuenta;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }
    
}
