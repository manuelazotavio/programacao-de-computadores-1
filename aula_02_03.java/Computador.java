/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula_02_03;

/**
 *
 * @author CG3038947
 */
public class Computador {
    String marca;
    int memoriaRAM;
    
    public Computador(String marca, int memoriaRAM){
        this.marca = marca;
        this.memoriaRAM = memoriaRAM;
        
    }
    
    public Computador(Computador computador){
        this.marca = computador.marca;
        this.memoriaRAM = computador.memoriaRAM;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getMemoriaRAM() {
        return memoriaRAM;
    }

    public void setMemoriaRAM(int memoriaRAM) {
        this.memoriaRAM = memoriaRAM;
    }
}
