/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import com.mycompany.pedido.Pedido;
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
public class PedidoTest {
    
   @Test
   void deveCalcularTotalNormal(){
       Pedido p = new Pedido();
       assertEquals(200,p.calcularTotal(100,2,false));
   }
   
   @Test
   void deveAplicarDescontoVip(){
       Pedido p = new Pedido();
       assertEquals(180,p.calcularTotal(100,2,true));
   }
   
   @Test
   void deveLancarExececaoValorInvalido(){
       Pedido p= new Pedido();
       
       assertThrows(IllegalArgumentException.class,() ->{
           p.calcularTotal(0,2,false);
       });
   }
   
   @Test
   void deveLancaExececaoQuantidadeInvalida(){
       Pedido p = new Pedido();
       
       assertThrows(IllegalArgumentException.class,() ->{
           p.calcularTotal(10,0,false);
       });
   }
   
   @Test
   void testCompleto(){
       Pedido p= new Pedido();
       
       assertAll(
       ()->assertEquals(90,p.calcularTotal(10,10,true)),
       ()->assertTrue(p.calcularTotal(10,10,true)<100),
       ()->assertNotNull(p)
       );
   }
}
