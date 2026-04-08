

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import com.mycompany.validadoresenha1.ValidadoreSenha1;
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
public class TestValidadoreSenha1 {
    
    @Test
    void testeSenhavalida(){
        ValidadoreSenha1 v = new ValidadoreSenha1();
        
        assertAll(
                ()->assertTrue(v.validar("senha123")),
                ()->assertFalse(v.validar("123")),
                ()->assertFalse(v.validar(null)),
                ()->assertNotNull(v),
                ()->assertDoesNotThrow(()->v.validar("abc12345"))
        );
    }
    
    @Test
    void testComparacoes(){
        String senha="senha123";
        
        assertEquals("senha123",senha);
        assertNotEquals("123",senha);
    }
    
    @Test
    void testeExececao(){
        assertThrows(NullPointerException.class,()->{
            String s = null;
            s.length();
        });
    }
    
    
}
