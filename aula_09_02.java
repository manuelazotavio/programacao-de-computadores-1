/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula.pkg09.pkg02;

import java.util.Scanner;

/**
 *
 * @author CG3038947
 */
public class Aula0902 {

    public static int soma(int x, int i) {
        return x + i;
    }

    public static void calculadora(int x, int i) {
        System.out.println(x + i);
        System.out.println(x - i);
        System.out.println(x * i);
        System.out.println(x / i);
    }

    public static void salario(String nome, double salario, double vendas) {

        double comissao = 0.15 * vendas;

        System.out.println("Vendedor " + nome + "tem o salario fixo de " + salario + "e liquido ganha " + (salario + comissao));
    }

    public static void media(String nome, double n1, double n2, double n3) {

        double media = ((n1 + n2 + n3) / 3);
        System.out.println("Aluno " + nome + "tem media de " + media);
    }

    public static void maiorQdez(int x) {

        if (x > 10) {
            System.out.println("maior que dez");
        }

    }

    public static void maiorOuMenorDeIdade(double idade) {
        if (idade >= 18) {
            System.out.println("maior de idade");
        } else {
            System.out.println("menor de idade");
        }

    }

    public static void calculadoraAvancada(int n1, int n2, String operacao) {

        double resultado = 0;

        switch (operacao) {
            case "+":
                resultado = n1 + n2;
            case "-":
                resultado = n1 - n2;
            case "x":
                resultado = n1 * n2;
            case "/":
                resultado = n1 / n2;
            default:
                System.out.println("Opcao invalida.");
        }

        System.out.println(resultado);

    }

    public static void lojaDeMoveis() {

        System.out.println("1 - Venda a vista" + "\n2 - Venda a Prazo 30 dias" + "\n3 - Venda a Prazo 60 dias" + "\n4 - Venda a Prazo com 90 dias" + "\n5 - Venda com cartao de debito" + "\n6 - Venda com cartao de credito");

        Scanner scanner = new Scanner(System.in);
//            
        int opcao = scanner.nextInt();
        switch (opcao) {
            case 1:
                System.out.println("Venda a vista");
                opcao = 0;
                break;
            default:
                System.out.println("Opcao invalida");
        }

    }

    public static void NumeroAteNumero() {
        Scanner scanner = new Scanner(System.in);
        int valorIni = scanner.nextInt();

        int valorFinal = scanner.nextInt();

        int excecao = scanner.nextInt();

        for (int i = valorIni; i <= valorFinal; i++) {
            if (i != excecao) {
                System.out.println(i);
            }
        }

    }

    public static void menu() {

        System.out.println("1. Buscar\n 2. Adicionar\n 3. Excluir\n 0. Sair");
        Scanner scanner = new Scanner(System.in);
        int opcao = scanner.nextInt();

        while (opcao > 0) {

            switch (opcao) {
                case 1:
                    System.out.println("Buscando...");
                    System.out.println("Busca concluida!");
                    break;
                case 2:
                    System.out.println("Adicionando...");
                    break;
                case 3:
                    System.out.println("Excluindo...");
                    break;
                case 0:
                    System.out.println("Bye");
                    break;
            }
            System.out.println("1. Buscar\n 2. Adicionar\n 3. Excluir\n 0. Sair");

            opcao = scanner.nextInt();
        }

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

//        for (int i = 0; i < 10; i++) {;;
//            Scanner scanner = new Scanner(System.in);
//            
//            double idade = scanner.nextDouble();
//            
//            maiorOuMenorDeIdade(idade);
//        };
//                    NumeroAteNumero();
        menu();
    }

}
