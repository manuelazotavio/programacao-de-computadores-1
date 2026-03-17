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
public class EntregaExpressa extends Entrega{
    
    private float taxaPrioridade;
    
    public EntregaExpressa(int codigoEntrega, statusEntrega statusEntrega, Drone drone, ArrayList<Pacote> pacotes, float valorEntrega, float taxaPrioridade){
        super(codigoEntrega, statusEntrega, drone, pacotes, valorEntrega);
        this.taxaPrioridade = taxaPrioridade;
    }
    
    @Override
    public float calcularTempoEntrega(){
        
        float valorTotal = this.getValorEntrega() + taxaPrioridade;
        
        this.setValorEntrega(valorTotal);
        
        float velocidade = this.getDrone().getVelocidade();
        
        float distanciaTotal = this.calcularDistanciaTotal();
        
        float tempo = (distanciaTotal / velocidade) * 60;
        return tempo * 0.8f; //minutos reduzidos
        
        
    }
}
