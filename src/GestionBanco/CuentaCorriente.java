/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GestionBanco;

/**
 *
 * @author jairo sierra 1152117
 */
public class CuentaCorriente extends Cuenta{
    
    private String lineaCredito;
    private double saldoDisponible;
    private double saldoContable;

    
    public CuentaCorriente(){}
    
    public CuentaCorriente(String lineaCredito, double saldoDisponible, double saldoContable, String numero, double monto, double saldo) {
        super(numero, monto, saldo);
        this.lineaCredito = lineaCredito;
        this.saldoDisponible = saldoDisponible;
        this.saldoContable = saldoContable;
    }

    public String getLineaCredito() {
        return lineaCredito;
    }

    public void setLineaCredito(String lineaCredito) {
        this.lineaCredito = lineaCredito;
    }

    public double getSaldoDisponible() {
        return saldoDisponible;
    }

    public void setSaldoDisponible(double saldoDisponible) {
        this.saldoDisponible = saldoDisponible;
    }

    public double getSaldoContable() {
        return saldoContable;
    }

    public void setSaldoContable(double saldoContable) {
        this.saldoContable = saldoContable;
    }
    
    
}
