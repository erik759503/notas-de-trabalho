/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.j_exemplo;

/**
 *
 * @author 2155007129
 */

import javax.swing.JOptionPane;

public class J_Exemplo {

    public static void main(String[] args) {
        
        empregado emp = new empregado();
        emp.address.estado = JOptionPane.showInputDialog("Entre com o estado: ");
        emp.address.cep = JOptionPane.showInputDialog("Entre com o Cep: ");
        emp.name.nome_ini = JOptionPane.showInputDialog("Entre com o seu primeiro nome: ");
        JOptionPane.showMessageDialog(null,"Estado digitado: " + emp.address.estado);
        JOptionPane.showMessageDialog(null,"Cep digitado: " + emp.address.cep);
        JOptionPane.showMessageDialog(null,"Nome digitado: " + emp.name.nome_ini);
        
    }
}
