/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula_02_03;

/**
 *
 * @author CG3038947
 */
public class Funcionario {
    String nome;
    float salario;
    
    public Funcionario(String nome, float salario){
        if (salario < 0){
            this.salario = 0;
        } else {
            this.salario = salario;
            this.nome = nome;
        }
    }
}
