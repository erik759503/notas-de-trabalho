/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 2155007129
 * 
 */
import java.util.Scanner;
import java.util.ArrayList;
public class ConcursoBeleza {
    
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        ArrayList<int[]>    inscricoes = new ArrayList<>();
        ArrayList<double[]> dados      = new ArrayList<>();
 
        System.out.println("=============================================");
        System.out.println("  SISTEMA DE INSCRIÇÃO - CONCURSO DE BELEZA");
        System.out.println("=============================================");
        System.out.println("Digite 0 no número de inscrição para encerrar.\n");
 
        while (true) {
            System.out.print("Número de inscrição (0 para sair): ");
            int inscricao = sc.nextInt();
 
            if (inscricao == 0) { // FLAG de encerramento
                break;
            }
 
            System.out.print("Altura (em metros, ex: 1.70): ");
            double altura = sc.nextDouble();
 
            System.out.print("Peso (em kg, ex: 55.0): ");
            double peso = sc.nextDouble();
 
            double imc = peso / (altura * altura);
            System.out.printf("  → IMC calculado: %.2f%n%n", imc);
 
            if (imc < 18) {
                inscricoes.add(new int[]{inscricao});
                dados.add(new double[]{altura, peso, imc});
            }
        }
 
        // Resultado final
        System.out.println("\n=============================================");
        System.out.println("          RESULTADO DO CONCURSO");
        System.out.println("=============================================");
 
        if (!inscricoes.isEmpty()) {
            System.out.printf("Total de aprovadas (IMC < 18): %d%n%n", inscricoes.size());
            System.out.printf("%-12s %8s %8s %8s%n", "Inscrição", "Altura", "Peso", "IMC");
            System.out.println("--------------------------------------------");
 
            for (int i = 0; i < inscricoes.size(); i++) {
                int    insc  = inscricoes.get(i)[0];
                double alt   = dados.get(i)[0];
                double peso  = dados.get(i)[1];
                double imc   = dados.get(i)[2];
                System.out.printf("%-12d %6.2fm %6.1fkg %7.2f%n", insc, alt, peso, imc);
            }
        } else {
            System.out.println("Nenhuma candidata foi aprovada.");
        }
 
        System.out.println("=============================================");
        sc.close();
    }
    
}
