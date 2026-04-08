/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import com.mycompany.conta1.Conta1;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.time.Duration;

/**
 *
 * @author 2155007129
 */
public class testConta1 {
    
    @Test
    void deveLancarExcecao(){
        Conta1 conta = new Conta1();
        
        assertThrows(RuntimeException.class,()->{conta.sacar(100);});
    }
    
    @Test
    void naoDeveLancarExcecao(){
        Conta1 conta=new Conta1();
        conta.depositar(200);
        
        assertDoesNotThrow(()-> conta.sacar(100));
    }
    
    @Test
    void devevalidarMultiplos(){
        Conta1 conta = new Conta1();
        conta.depositar(300);
        
        assertAll(
        ()->assertEquals(300,conta.getSaldo()),
        ()->assertTrue(conta.getSaldo()>0)
        );
    }
    
    @Test
    void deveExecutarRapido(){
        assertTimeout(Duration.ofSeconds(1),()->{
            Thread.sleep(500);
        
        });
    }
    
}
