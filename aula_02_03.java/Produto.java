/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula_02_03;

/**
 *
 * @author CG3038947
 */
public class Produto {
    String nome;
    float preco;
    int quantidade;
    
    public Produto(String nome){
        this.nome = nome;
    }
    
    
    public Produto(String nome, float preco){
        this(nome);
        this.preco = preco;
    }
    
    public Produto(String nome, float preco, int quantidade){
        this(nome, preco);
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
