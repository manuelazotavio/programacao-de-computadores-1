/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula.pkg09.pkg02;

/**
 *
 * @author CG3038947
 */
public class Pacote {
    
    private String descricao;
    private float peso;
    private String enderecoDestino;
    private float distanciaEntregaKm;

    public Pacote(String descricao, float peso, String enderecoDestino, float distanciaEntregaKm) {
        this.descricao = descricao;
        this.peso = peso;
        this.enderecoDestino = enderecoDestino;
        this.distanciaEntregaKm = distanciaEntregaKm;
    }

    
    public void exibirDetalhes() {
        System.out.println("Pacote{" + "descricao=" + descricao + ", peso=" + peso + ", enderecoDestino=" + enderecoDestino + ", distanciaEntregaKm=" + distanciaEntregaKm + '}');
    }
    
    

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public String getEnderecoDestino() {
        return enderecoDestino;
    }

    public void setEnderecoDestino(String enderecoDestino) {
        this.enderecoDestino = enderecoDestino;
    }

    public float getDistanciaEntregaKm() {
        return distanciaEntregaKm;
    }

    public void setDistanciaEntregaKm(float distanciaEntregaKm) {
        this.distanciaEntregaKm = distanciaEntregaKm;
    }
    
    
    
}
