/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.universidade;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Sistema Universitário
 * Requisitos: estrutura (classe Aluno), funções (métodos estáticos),
 * menu, alocação dinâmica (ArrayList), flag de encerramento.
 *
 * Situações:
 *   Aprovado  → média >= 7.0
 *   Exame     → média >= 5.0 e < 7.0
 *   Reprovado → média < 5.0
 */
public class Universidade {

    // =========================================================
    // ESTRUTURA (equivalente a struct em C)
    // =========================================================
    static class Aluno {
        int    matricula;
        char   sexo;      // 'M' ou 'F'
        double nota1;
        double nota2;
        double media;

        Aluno(int matricula, char sexo, double nota1, double nota2) {
            this.matricula = matricula;
            this.sexo      = sexo;
            this.nota1     = nota1;
            this.nota2     = nota2;
            this.media     = calcularMedia(nota1, nota2);
        }
    }

    // =========================================================
    // FUNÇÕES (métodos estáticos)
    // =========================================================

    /** Calcula a média aritmética das duas notas */
    static double calcularMedia(double nota1, double nota2) {
        return (nota1 + nota2) / 2.0;
    }

    /** Retorna a situação do aluno com base na média */
    static String situacao(Aluno a) {
        if (a.media >= 7.0) return "Aprovado";
        if (a.media >= 5.0) return "Exame";
        return "Reprovado";
    }

    /** Lê os dados de cada aluno e insere na lista (alocação dinâmica) */
    static void cadastrarAlunos(Scanner sc, ArrayList<Aluno> lista) {
        System.out.println("CADASTRO DE ALUNOs");
        System.out.println("Digite 0 na matrícula para encerrar");

        while (true) {
            System.out.print("  Matrícula (0 = encerrar): ");
            int matricula = sc.nextInt();

            if (matricula == 0) {   // ← FLAG de encerramento
                System.out.println("  Cadastro encerrado.\n");
                break;
            }

            System.out.print("  Sexo (M/F): ");
            char sexo = sc.next().toUpperCase().charAt(0);

            System.out.print("  Nota 1: ");
            double nota1 = sc.nextDouble();

            System.out.print("  Nota 2: ");
            double nota2 = sc.nextDouble();

            // Alocação dinâmica: cria novo objeto e insere na lista
            Aluno a = new Aluno(matricula, sexo, nota1, nota2);
            lista.add(a);

            System.out.printf("  → Média: %.2f  |  Situação: %s%n%n",
                a.media, situacao(a));
        }
    }

    /** Imprime alunos aprovados (média >= 7.0) */
    static void exibirAprovados(ArrayList<Aluno> lista) {
        System.out.println("ALUNOS APROVADOS  (média >= 7)");

        ArrayList<Aluno> aprovados = new ArrayList<>();
        for (Aluno a : lista) {
            if (a.media >= 7.0) aprovados.add(a);
        }

        if (aprovados.isEmpty()) {
            System.out.println("  Nenhum aluno aprovado.");
        } else {
            cabecalho();
            for (Aluno a : aprovados) linhaAluno(a);
            System.out.printf("%n  Total: %d aluno(s) aprovado(s).%n", aprovados.size());
        }
        System.out.println();
    }

    /** Imprime alunos em exame (5.0 <= média < 7.0) */
    static void exibirExame(ArrayList<Aluno> lista) {
        System.out.println("ALUNOS EM EXAME  (5 <= média < 7)");


        ArrayList<Aluno> exame = new ArrayList<>();
        for (Aluno a : lista) {
            if (a.media >= 5.0 && a.media < 7.0) exame.add(a);
        }

        if (exame.isEmpty()) {
            System.out.println("  Nenhum aluno em exame.");
        } else {
            cabecalho();
            for (Aluno a : exame) linhaAluno(a);
            System.out.printf("%n  Total: %d aluno(s) em exame.%n", exame.size());
        }
        System.out.println();
    }

    /** Determina e imprime o melhor aluno e o aluno com menor média */
    static void exibirDestaques(ArrayList<Aluno> lista) {
        System.out.println("DESTAQUES DA TURMA");

        if (lista.isEmpty()) {
            System.out.println("  Nenhum aluno cadastrado.\n");
            return;
        }

        Aluno melhor = lista.get(0);
        Aluno pior   = lista.get(0);

        for (Aluno a : lista) {
            if (a.media > melhor.media) melhor = a;
            if (a.media < pior.media)   pior   = a;
        }

        System.out.println("  ► Melhor aluno da turma:");
        cabecalho();
        linhaAluno(melhor);

        System.out.println("\n  ► Aluno com menor média:");
        cabecalho();
        linhaAluno(pior);
        System.out.println();
    }

    /** Imprime todos os alunos cadastrados */
    static void exibirTodos(ArrayList<Aluno> lista) {
        System.out.println("TODOS OS ALUNOS");

        if (lista.isEmpty()) {
            System.out.println("  Nenhum aluno cadastrado.\n");
            return;
        }

        cabecalho();
        for (Aluno a : lista) linhaAluno(a);
        System.out.printf("%n  Total: %d aluno(s) cadastrado(s).%n%n", lista.size());
    }

    /** Cabeçalho da tabela */
    static void cabecalho() {
        System.out.printf("  %-12s %-6s %8s %8s %8s %-12s%n",
            "Matrícula", "Sexo", "Nota 1", "Nota 2", "Média", "Situação");
        System.out.println("  " + "-".repeat(60));
    }

    /** Linha de dados de um aluno */
    static void linhaAluno(Aluno a) {
        System.out.printf("  %-12d %-6c %8.2f %8.2f %8.2f %-12s%n",
            a.matricula, a.sexo, a.nota1, a.nota2, a.media, situacao(a));
    }

    /** Exibe o menu e retorna a opção escolhida */
    static int exibirMenu(Scanner sc) {
        System.out.println("SISTEMA UNIVERSITÁRIO  –  MENU");
        System.out.println(" 1. Cadastrar alunos");
        System.out.println("2. Alunos aprovados   (média >= 7)");
        System.out.println("3. Alunos em exame    (5 <= média < 7)");
        System.out.println("4. Destaques da turma");
        System.out.println("5. Exibir todos os alunos");
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
        ArrayList<Aluno> alunos = new ArrayList<>();

        System.out.println("SISTEMA DE GESTÃO UNIVERSITÁRIA");


        int opcao;
        do {
            System.out.println();
            opcao = exibirMenu(sc);

            switch (opcao) {
                case 1 -> cadastrarAlunos(sc, alunos);
                case 2 -> exibirAprovados(alunos);
                case 3 -> exibirExame(alunos);
                case 4 -> exibirDestaques(alunos);
                case 5 -> exibirTodos(alunos);
                case 0 -> System.out.println("\n  Encerrando o sistema. Até logo!\n");
                default -> System.out.println("\n  Opção inválida. Tente novamente.\n");
            }
        } while (opcao != 0);

        sc.close();
    }
}
