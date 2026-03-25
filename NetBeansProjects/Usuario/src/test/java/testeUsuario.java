/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import com.mycompany.usuario.Usuario;
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
public class testeUsuario {
    
    

    @Test
    public void testeMaiorDeIdade(){
        
        Usuario u = new Usuario("Anna",20);
        
        assertTrue(u.maiorDeIdade());
    }
    
    @Test
    public void testeNomeNaoNulo(){
        Usuario u = new Usuario("Carlos",25);
        
        assertNotNull(u.getNome());
    }
}
