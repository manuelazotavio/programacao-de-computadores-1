/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula.pkg09.pkg02;

import java.util.ArrayList;

/**
 *
 * @author CG3038947
 */
public class Aula0902 {

   
    public static void main(String[] args) {
        
        
        
        CentralDrones central = new CentralDrones();
        
        central.cadastrarDrone(1, "Apple", 5, 10, 3, Boolean.TRUE);
        
        Pacote pacote1 = new Pacote("Iphone 11", 0.3f, "Rua das Maritacas", 10);
        
        ArrayList<Pacote> pacotes1 = new ArrayList<>();
        
        Entrega entrega1 = central.registrarEntrega(pacotes1, 10);
        
        central.atribuirDrone(entrega1);
        
        central.listarEntregas();
        
    }
    
    
  

}
