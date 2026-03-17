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
public class Drone {
    
    private int id;
    private String modelo;
    private float capCarga;
    private float velocidade;
    private int autonomiaVoo;
    private Boolean disponivel;
  

    public Drone(int id, String modelo, float capCarga, float velocidade, int autonomiaVoo, Boolean disponivel) {
        this.id = id;
        this.modelo = modelo;
        this.capCarga = capCarga;
        this.velocidade = velocidade;
        this.autonomiaVoo = autonomiaVoo;
        this.disponivel = disponivel;
       
    }

    
    public float getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(float velocidade) {
        this.velocidade = velocidade;
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Boolean getDisponivel() {
        return disponivel;
    }

    public void setDisponivel(Boolean disponivel) {
        this.disponivel = disponivel;
    }

   
    public void exibirInformacoes() {
        System.out.println("Id: " + this.id + "\n" + "Modelo: " + this.modelo + "\n");
    }
    
    public void marcarDisponivel(){
        this.disponivel = true;
    }
    public void marcarOcupado(){
        this.disponivel = false;
    }
    

    public float getCapCarga() {
        return capCarga;
    }

    public void setCapCarga(float capCarga) {
        this.capCarga = capCarga;
    }

    public int getAutonomiaVoo() {
        return autonomiaVoo;
    }

    public void setAutonomiaVoo(int autonomiaVoo) {
        this.autonomiaVoo = autonomiaVoo;
    }

  
    
    
}
