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
public class CuentaAhorro  extends Cuenta{
    
    private int nMaxGiros;
    private double tasaIntereM;
    
    
    public CuentaAhorro(){}
    
    public CuentaAhorro(int nMaxGiros, double tasaIntereM, String numero, double monto, double saldo) {
        super(numero, monto, saldo);
        this.nMaxGiros = nMaxGiros;
        this.tasaIntereM = tasaIntereM;
    }

    public int getnMaxGiros() {
        return nMaxGiros;
    }

    public void setnMaxGiros(int nMaxGiros) {
        this.nMaxGiros = nMaxGiros;
    }

    public double getTasaIntereM() {
        return tasaIntereM;
    }

    public void setTasaIntereM(double tasaIntereM) {
        this.tasaIntereM = tasaIntereM;
    }
    
            
}
