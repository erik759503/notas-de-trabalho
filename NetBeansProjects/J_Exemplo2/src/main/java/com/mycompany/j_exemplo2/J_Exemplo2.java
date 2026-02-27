/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.j_exemplo2;

/**
 *
 * @author 2155007129
 */
import javax.swing.JOptionPane;
public class J_Exemplo2 {

    public static void main(String[] args) {
        
        empregado e = new empregado();
        
        ler(e);
                
        JOptionPane.showMessageDialog(null,"Nome digitado :" + e.nome);
        JOptionPane.showMessageDialog(null,"Salario digitado:" + e.salario);
    }   
        public static void ler(empregado e){
            e.nome = JOptionPane.showInputDialog("Entrege com o nome: ");
            e.salario = Float.parseFloat(JOptionPane.showInputDialog("Entrege com salario: "));
        }
    
}


