package aula_02_03;

import java.util.ArrayList;

public class Pessoa {
    String nome;
    int idade;
    float altura, peso;
    
    Pessoa pai;
    Pessoa mae;
    
    ArrayList<Pessoa> filhos = new ArrayList<>();


    public void exibeInformacoes(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Altura: " + this.altura);
        System.out.println("Peso: " + this.peso);
        
        if(this.pai != null){
            System.out.println("Nome do Pai: " + this.pai.getNome());
            System.out.println("Idade do Pai: " + this.pai.getIdade());
        }else
            System.out.println("Pai desconhecido" );
            
        if(this.mae != null){
            System.out.println("Nome da Mae: " + this.mae.getNome());
            System.out.println("Idade da Mae: " + this.mae.getIdade());
        }else
            System.out.println("Filho de chocadeira");
    }



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public Pessoa getPai() {
        return pai;
    }

    public void setPai(Pessoa pai) {
        this.pai = pai;
        
        pai.setFilho(this);
    }

    public Pessoa getMae() {
        return mae;
    }

    public void setMae(Pessoa mae) {
        this.mae = mae;
        mae.setFilho(this);
    }

    public ArrayList<Pessoa> getFilhos() {
        return filhos;
    }

    public void setFilhos(ArrayList<Pessoa> filhos) {
        this.filhos = filhos;
    }

    public void setFilho(Pessoa filho) {
        this.filhos.add(filho);
    }
    
    public void exibeFilhos(){
       
        if(filhos == null){
            System.out.println("Essa pessoa nao tem filhos");
        }else{
            System.out.println("Filhos de " + this.getNome());
            for (int i = 0; i < filhos.size(); i++) {
                System.out.println( filhos.get(i).getNome() );
            }
        }
    }
    
    
    
}
