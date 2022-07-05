/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Heranca;

import java.util.Date;

/**
 *
 * @author leandro
 */
public class Main {
    public static void main(String[] args) {
        
        Vendedor v = new Vendedor("Marcio", new Date(), "12321123", 1000.0d);
        v.setTotalPecasVendidas(75);
        System.out.println(v.mostrarDados());
        
        Motorista m = new Motorista("Pedro", new Date(), "12321123", 1000.0d);
        System.out.println(m.mostrarDados());
        
    }
}
