/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package fruteriaed;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author migue
 */
public class ColaTest {
    
    public ColaTest() {
    }

    /**
     * Test of aniadirCliente method, of class Cola.
     */
    @Test
    public void testAniadirCliente() {
        Cola s = new Cola(2);
        
        s.aniadirCliente();
        s.aniadirCliente();
        s.aniadirCliente();
        assertEquals(5, s.nclientes);
    }

    /**
     * Test of mostrar method, of class Cola.
     */
    @Test
    public void testMostrar() {
        Cola s = new Cola(10);
        
        s.despachar();
        s.despachar();
        assertEquals(8, s.nclientes);
        
    }

    /**
     * Test of despachar method, of class Cola.
     */
    @Test
    public void testDespachar() {
        Cola s = new Cola(5);
        
        s.despachar();
        s.despachar();
        s.despachar();
        assertEquals(2, s.nclientes);
    }

    /**
     * Test of adelantar method, of class Cola.
     */
    @Test
    public void testAdelantar() {
    }

    /**
     * Test of retrasar method, of class Cola.
     */
    @Test
    public void testRetrasar() {
    }

    /**
     * Test of mostrarDespachados method, of class Cola.
     */
    @Test
    public void testMostrarDespachados() {
    }
    
}
