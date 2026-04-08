package com.mycompany.validadoresenha1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */



/**
 *
 * @author 2155007129
 */
public class ValidadoreSenha1 {

    public boolean validar(String senha){
        if(senha == null)
            return false;
        if(senha.length()<8)
            return false;
        if(!senha.matches(".*\\d.*"))
            return false;
        
        return true;
    }
}
