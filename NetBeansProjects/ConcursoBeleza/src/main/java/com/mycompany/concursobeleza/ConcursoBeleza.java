/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.concursobeleza;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Concurso de Beleza
 * Requisitos: estrutura (classe Moca), funções (métodos estáticos),
 * menu, alocação dinâmica (ArrayList), flag de encerramento.
 */
public class ConcursoBeleza {

    // =========================================================
    // ESTRUTURA (equivalente a struct em C)
    // =========================================================
    static class Moca {
        int    inscricao;
        double altura;
        double peso;
        double imc;

        Moca(int inscricao, double altura, double peso) {
            this.inscricao = inscricao;
            this.altura    = altura;
            this.peso      = peso;
            this.imc       = calcularIMC(peso, altura);
        }
    }

    // =========================================================
    // FUNÇÕES (métodos estáticos)
    // =========================================================

    /** Calcula o IMC: peso / altura² */
    static double calcularIMC(double peso, double altura) {
        return peso / (altura * altura);
    }

    /** Lê os dados de uma moça e a adiciona na lista (alocação dinâmica) */
    static void cadastrarMocas(Scanner sc, ArrayList<Moca> lista) {
        System.out.println("CADASTRO DE CANDIDATAS");
        System.out.println("(Digite 0 no nº de inscrição p/ sair)");
        System.out.println("\n");

        while (true) {
            System.out.print("  Número de inscrição (0 = encerrar): ");
            int inscricao = sc.nextInt();

            if (inscricao == 0) {   // ← FLAG de encerramento
                System.out.println("  Cadastro encerrado.\n");
                break;
            }

            System.out.print("  Altura (em metros, ex: 1.70): ");
            double altura = sc.nextDouble();

            System.out.print("  Peso   (em kg,     ex: 55.0) : ");
            double peso = sc.nextDouble();

            // Alocação dinâmica: cria novo objeto e insere na lista
            Moca m = new Moca(inscricao, altura, peso);
            lista.add(m);

            System.out.printf("  → IMC calculado: %.2f%n%n", m.imc);
        }
    }

    /** Imprime apenas as moças aprovadas (IMC < 18) */
    static void exibirAprovadas(ArrayList<Moca> lista) {
        System.out.println("RESULTADO DO CONCURSO");
        System.out.println("Critério de aprovação: IMC < 18");

        ArrayList<Moca> aprovadas = new ArrayList<>();
        for (Moca m : lista) {
            if (m.imc < 18.0) {
                aprovadas.add(m);
            }
        }

        if (aprovadas.isEmpty()) {
            System.out.println("  Nenhuma candidata foi aprovada.");
        } else {
            System.out.printf("  Total de aprovadas: %d%n%n", aprovadas.size());
            System.out.printf("  %-12s %9s %9s %9s%n",
                "Inscrição", "Altura(m)", "Peso(kg)", "IMC");
            System.out.println("  " + "-".repeat(44));
            for (Moca m : aprovadas) {
                System.out.printf("  %-12d %9.2f %9.1f %9.2f  ✓%n",
                    m.inscricao, m.altura, m.peso, m.imc);
            }
        }
        System.out.println();
    }

    /** Imprime todas as candidatas cadastradas */
    static void exibirTodas(ArrayList<Moca> lista) {
        System.out.println("TODAS AS CANDIDATAS");

        if (lista.isEmpty()) {
            System.out.println("  Nenhuma candidata cadastrada ainda.\n");
            return;
        }

        System.out.printf("  %-12s %9s %9s %9s %10s%n",
            "Inscrição", "Altura(m)", "Peso(kg)", "IMC", "Situação");
        System.out.println("  " + "-".repeat(54));
        for (Moca m : lista) {
            String situacao = (m.imc < 18.0) ? "APROVADA ✓" : "Reprovada ✗";
            System.out.printf("  %-12d %9.2f %9.1f %9.2f  %s%n",
                m.inscricao, m.altura, m.peso, m.imc, situacao);
        }
        System.out.println();
    }

    /** Exibe o menu e retorna a opção escolhida */
    static int exibirMenu(Scanner sc) {
        System.out.println("CONCURSO DE BELEZA  –  MENU");
        System.out.println("\n");
        System.out.println("1. Cadastrar candidatas");
        System.out.println("2. Exibir aprovadas  (IMC < 18)");
        System.out.println("3. Exibir todas as candidatas");
        System.out.println("0. Sair");
        System.out.print("  Escolha uma opção: ");
        return sc.nextInt();
    }

    // =========================================================
    // MAIN
    // =========================================================
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Alocação dinâmica da lista principal
        ArrayList<Moca> candidatas = new ArrayList<>();

        System.out.println("SISTEMA DE INSCRIÇÃO - CONCURSO BELEZA");

        int opcao;
        do {
            System.out.println();
            opcao = exibirMenu(sc);

            switch (opcao) {
                case 1 -> cadastrarMocas(sc, candidatas);
                case 2 -> exibirAprovadas(candidatas);
                case 3 -> exibirTodas(candidatas);
                case 0 -> System.out.println("\n  Encerrando o sistema. Até logo!\n");
                default -> System.out.println("\n  Opção inválida. Tente novamente.\n");
            }
        } while (opcao != 0);

        sc.close();
    }
}