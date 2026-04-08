/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import com.mycompany.aulacalculadora.Calculadora;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author 2155007129
 */
public class CaculadoratestEach {
    
    Calculadora calc;
    
    @BeforeEach
    void inicializar(){
        calc = new Calculadora();
    }
    
    @Test
    void testeSoma(){
        assertEquals(10,calc.somar(7,3));
    }
    
    @Test
    void testeSubtracao(){
        assertEquals(4,calc.subtrair(7,3));
    }
    
}
