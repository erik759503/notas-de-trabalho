package com.mycompany.pedido;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */



/**
 *
 * @author 2155007129
 */
public class Pedido {

    public double calcularTotal(double valorUnitario, int quantidade, boolean clienteVip){
        
        if(valorUnitario<=0)
            throw new IllegalArgumentException("Valor inválido");
        
        if(quantidade<=0)
            throw new IllegalArgumentException("Quantidade inválida");
        
        double total = valorUnitario * quantidade;
    
        if(clienteVip){
            total*=0.9;//10%desconto
        }
        return total;
    }
}
