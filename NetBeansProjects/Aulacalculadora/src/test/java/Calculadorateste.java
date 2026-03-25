/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import com.mycompany.aulacalculadora.Calculadora;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author 2155007129
 */
public class Calculadorateste {
    
    @Test
    public void testSoma(){
        Calculadora calc = new Calculadora();
        int resultado = calc.somar(5,3);
        
        assertEquals(8,resultado);
    }
    
    @Test
    public void testeSubtracao(){
        Calculadora calc=new Calculadora();
        int resultado = calc.subtrair(10,4);
        
        assertEquals(6,resultado);
    }
    
    @Test
    public void testeMultiplicar(){
        Calculadora calc = new Calculadora();
        int resultado = calc.multiplicar(2, 5);
        
        assertEquals(10,resultado);
    }
    
    @Test
    public void dividir(){
        Calculadora calc= new Calculadora();
        float resultado = calc.dividir(15,3);
        
        assertEquals(5,resultado);
    }
    
}
