package aula_02_03;

import java.util.HashSet;
import java.util.Set;

public class Aula_02_03 {

    public static void main(String[] args) {
        
        Pessoa p1 = new Pessoa();
        p1.setNome("Joao");
        p1.setIdade(18);
        p1.setAltura(1.8f);
        
        Pessoa p2 = new Pessoa();
        p2.setNome("Antonio pai do Joao");
        p2.setIdade(48);
        p2.setAltura(1.67f);
        
        Pessoa p3 = new Pessoa();
        p3.setNome("Amelia mae do Joao");
        p3.setIdade(44);
        p3.setAltura(1.83f);
        
        
        
       p1.setPai(p2);
       p1.setMae(p3);
//        
//        p1.setFilho(p2);
//        p1.setFilho(p3);
//        
        
        p2.exibeFilhos();
        
        

        
        
        
        
        
        
        


    }
    
}
