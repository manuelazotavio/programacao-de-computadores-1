/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula_02_03;

/**
 *
 * @author CG3038947
 */
public class Retangulo {
    private float largura, altura;
    
    public Retangulo(float largura, float altura){
        this.largura = largura;
        this.altura = altura;
    }
    
    public float calculaArea(float largura, float altura){
        float area = largura * altura;
        return area;
    }
    
    
}
