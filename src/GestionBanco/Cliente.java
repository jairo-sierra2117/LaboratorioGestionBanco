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
public class Cliente {
    private String nombre;
    private String apellido;
    private String RUT;
    private Cuenta cuenta;
    private ArrayList<Cuenta> cuentaAL;
    
    private int count = 0;
    
    
    
    public Cliente(){}
    
    public Cliente(String nombre, String apellido, String RUT) {
        this.cuentaAL = new ArrayList();
        this.nombre = nombre;
        this.apellido = apellido;
        this.RUT = RUT;
    }

    public Cliente(String nombre, String apellido, String RUT, Cuenta cuenta, ArrayList<Cuenta> cuentaAL) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.RUT = RUT;
        this.cuenta = cuenta;
        this.cuentaAL = cuentaAL;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getRUT() {
        return RUT;
    }

    public void setRUT(String RUT) {
        this.RUT = RUT;
    }

    public Cuenta getCuenta() {
        return cuenta;
    }

    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }
    
    public ArrayList<Cuenta> getCuentaAL() {
        return cuentaAL;
    }

    public void setCuentaAL(ArrayList<Cuenta> cuentaAL) {
        this.cuentaAL = cuentaAL;
    }
    
    
    public void añadirCuenta(Cuenta cuenta){
        System.out.println("Cliente: "+nombre+" añadio la cuenta --> "+cuenta.getNumero());
        cuentaAL.add(cuenta);
        count++;
    }
    
    public void numCuenta(){
        System.out.println("Cliente: "+nombre+" Tiene "+count+" Cuentas");
    }
    
    public void mostrarSaldo(){
        
        System.out.println("                 SALDO");
        for(int i=0;i<cuentaAL.size();i++){
        System.out.println("Cliente: "+nombre+" En la cuenta:"+cuentaAL.get(i).getNumero()+"\n Saldo: $"+cuentaAL.get(i).getSaldo());
        }
        System.out.println("---------------------------------------------------");
    }
    
    public void mostrarCuentas(){
        System.out.println("Cliente: " + nombre);
        for(int i=0;i<cuentaAL.size();i++){
            System.out.println(cuentaAL.get(i).toString());
        }
        System.out.println("-------------------------------------------------");
    }
    
}
