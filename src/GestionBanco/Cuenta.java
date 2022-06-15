/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GestionBanco;

import java.util.ArrayList;

/**
 *
 * @author jairo sierra 1152117
 */
public class Cuenta {
    
    private String numero;
    private double monto;
    private double saldo;


    public Cuenta(){}
    
    public Cuenta(String numero, double monto, double saldo) {
        this.numero = numero;
        this.monto = monto;
        this.saldo = saldo;
    }

    public Cuenta(String numero, double monto, double saldo, Cliente cliente) {
        this.numero = numero;
        this.monto = monto;
        this.saldo = saldo;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Cuenta{" + "numero=" + numero + ", monto=" + monto + ", saldo=" + saldo + '}';
    }
    
}
