/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula.pkg09.pkg02;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author CG3038947
 */
public class CentralDrones {
    private ArrayList<Drone> drones;
    private ArrayList<Entrega> entregas;
    
    
    public CentralDrones(){
        ArrayList<Drone> drones = new ArrayList<>();
        this.drones = drones;
        ArrayList<Entrega> entregas = new ArrayList<>();
        this.entregas = entregas;
    }
    
    public void cadastrarDrone(int id, String modelo, float capCarga, float velocidade, int autonomiaVoo, Boolean disponivel){
        Drone novoDrone = new Drone(id, modelo, capCarga, velocidade, autonomiaVoo, disponivel);
        System.out.println("Drone adicionado com sucesso.");
        
        drones.add(novoDrone);
    }
    
    public Entrega registrarEntrega(ArrayList<Pacote> pacotes, float valorEntrega){
        
        Entrega.statusEntrega status = Entrega.statusEntrega.PENDENTE;
        
        boolean existe;
       
        
        int codigoEntrega;
        
        Random random = new Random();
        
        do{
            codigoEntrega = random.nextInt(1000);
            existe = false;
            
            for(Entrega entrega : entregas){
                if(entrega.getCodigoEntrega() == codigoEntrega){
                    existe = true;
                }
            }
        } while (existe);
        
        
        Entrega novaEntrega = new Entrega(codigoEntrega, status, null, pacotes, valorEntrega);
        
        entregas.add(novaEntrega);
        
        System.out.println("Entrega " + codigoEntrega + " adicionada com sucesso.");
        
        return novaEntrega;
    }
    
    public void atribuirDrone(Entrega entrega){
        
        Drone droneIdeal = melhorDroneParaEntrega(entrega);
        
        if (droneIdeal != null){
            entrega.setDrone(droneIdeal);
            System.out.println("Drone " + droneIdeal.getId() + " vinculado com sucesso.");
        } else {
            System.out.println("Não existem drones disponíveis para essa entrega.");
        }
        
    }
    
    public Drone melhorDroneParaEntrega(Entrega entrega){
        
        Drone droneIdeal = null;
        for(Drone drone : drones){
            if(drone.getDisponivel() == true){
                
                if(drone.getCapCarga() >= entrega.calcularPesoTotal()){
                    
                    if(drone.getAutonomiaVoo() >= entrega.calcularDistanciaTotal()){
                        droneIdeal = drone;
                    } 
                }
            }
        }
        
        return droneIdeal;
    }
    
    public void listarEntregas(){
        
        System.out.println("\nEntregas: ");
        
        for(Entrega entrega : entregas){
            
            System.out.println("---------------------------- \n" + "ID: " + entrega.getCodigoEntrega() + "\n" + "ID do Drone: " + entrega.getDrone().getId() + "\n"  + "Status: "  + entrega.getStatusEntrega() + "\n" + "Valor da entrega: " + entrega.getValorEntrega() + "\n");
        }
    }
    
    public void listarDronesDisponiveis(){
        System.out.println("Drones disponíveis: ");
        for(Drone drone : drones){
            if(drone.getDisponivel()){
                drone.exibirInformacoes();
            }
        }
    }
    
    public Entrega selecionarEntrega(){
        
        Entrega entregaSelecionada = null;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Selecione o codigo da entrega:");
        
        for(Entrega entrega : entregas){
            System.out.println(entrega.getCodigoEntrega());
        }
        
        int codigo = scanner.nextInt();
        
        for(Entrega entrega : entregas){
            if(codigo == entrega.getCodigoEntrega()){
                entregaSelecionada = entrega;
            }
        }
        
        return entregaSelecionada;
    }
    
    
}
