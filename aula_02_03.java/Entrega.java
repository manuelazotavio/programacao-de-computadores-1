/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula.pkg09.pkg02;

import java.util.ArrayList;

/**
 *
 * @author CG3038947
 */
public class Entrega {
    
    private int codigoEntrega;
    private statusEntrega statusEntrega;
    private Drone drone;
    private ArrayList<Pacote> pacotes;
    private float valorEntrega;

    public Entrega(int codigoEntrega, statusEntrega statusEntrega, Drone drone, ArrayList<Pacote> pacotes, float valorEntrega) {
        this.codigoEntrega = codigoEntrega;
        this.statusEntrega = statusEntrega;
        this.drone = drone;
        this.pacotes = pacotes;
        this.valorEntrega = valorEntrega;
    }

    public float getValorEntrega() {
        return valorEntrega;
    }

    public void setValorEntrega(float valorEntrega) {
        this.valorEntrega = valorEntrega;
    }
    
    public int getCodigoEntrega() {
        return codigoEntrega;
    }

    public void setCodigoEntrega(int codigoEntrega) {
        this.codigoEntrega = codigoEntrega;
    }

    public statusEntrega getStatusEntrega() {
        return statusEntrega;
    }

    public void setStatusEntrega(statusEntrega statusEntrega) {
        this.statusEntrega = statusEntrega;
    }

    

    public Drone getDrone() {
        return drone;
    }

    public void setDrone(Drone drone) {
        this.drone = drone;
    }

    public ArrayList<Pacote> getPacotes() {
        return pacotes;
    }

    public void setPacotes(ArrayList<Pacote> pacotes) {
        this.pacotes = pacotes;
    }
    
    public void adicionarPacote(Pacote pacote){
        this.pacotes.add(pacote);
        System.out.println("Pacote adicionado com sucesso.");
    }
    
    public float calcularPesoTotal(){
        float pesoTotal = 0;
        for(Pacote pacote : pacotes){
            pesoTotal += pacote.getPeso();
        }
        
        return pesoTotal;
    }
    
    public float calcularDistanciaTotal(){
        float distanciaTotal = 0;
        
        for(Pacote pacote : pacotes){
            distanciaTotal += pacote.getDistanciaEntregaKm();
        }
        
        return distanciaTotal;
    }
    
    public void listarPacotes(){
        for(Pacote pacote : pacotes){
            System.out.println("Pacote: " + pacote.getDescricao() + pacote.getEnderecoDestino() + pacote.getPeso() + "\n");
        }
    }
    
    public float calcularTempoEntrega(){
        
        float velocidade = this.drone.getVelocidade();
        
        
        float distanciaTotal = this.calcularDistanciaTotal();
        
        return (distanciaTotal / velocidade) * 60; //minutos
        
        
    }
    
    enum statusEntrega {
        PENDENTE,
        EM_ENTREGA,
        ENTREGUE,
        CANCELADA
    }
}
