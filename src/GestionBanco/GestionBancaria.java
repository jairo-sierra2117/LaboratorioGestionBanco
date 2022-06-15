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
public class GestionBancaria {

    public static void main(String[] args) {

        Cliente c1 = new Cliente("jairo", "sierra", "1256732-212");
        Cliente c2 = new Cliente("yorgi", "sierra", "2436732-483");

        CuentaCorriente cuentaC = new CuentaCorriente("Buena", 1500000.0, 1500000.0, "3219014784", 1500000.0, 1500000.0);
        CuentaAhorro cuentaAH = new CuentaAhorro(10, 2.4, "31487410921", 1500000.0, 1500000.0);
        CuentaAhorro cuentaAH2 = new CuentaAhorro(10, 2.4, "3219014784", 1500000.0, 1500000.0);

        c1.añadirCuenta(cuentaC);
        c1.añadirCuenta(cuentaAH2);

        c2.añadirCuenta(cuentaAH);
        System.out.println("-------------------------------------------------");
        c1.numCuenta();
        c2.numCuenta();
        System.out.println("-------------------------------------------------");
        c1.mostrarCuentas();
        c2.mostrarCuentas();
        
        c1.mostrarSaldo();
        c2.mostrarSaldo();

    }
}
