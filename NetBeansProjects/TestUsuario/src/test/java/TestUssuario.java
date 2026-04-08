

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import com.mycompany.testusuario.TestUsuario;
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
public class TestUssuario {
    
    @Test
    void deveValidarNull(){
        TestUsuario u = new TestUsuario(null);
        assertNull(u.getNome());
    }
    
    @Test
    void deveValidarNaoNull(){
        TestUsuario u = new TestUsuario("Ana");
        assertNotNull(u.getNome());
    }
    
    @Test
    void deveCompararReferencia(){
        TestUsuario u1 = new TestUsuario("Ana");
        TestUsuario u2 = u1;
        
        assertSame(u1,u2);
    }
    
    @Test
    void deveCompararReferenciasDiferentes(){
        TestUsuario u1 = new TestUsuario("Ana");
        TestUsuario u2 = new TestUsuario("Ana");
        
        assertNotSame(u1,u2);
    }
    
    
    
}
