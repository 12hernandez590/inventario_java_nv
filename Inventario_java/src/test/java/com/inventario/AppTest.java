package com.inventario;

import junit.framework.TestCase;

public class AppTest extends TestCase {

    public void testResta() {
        int resultado = App.restar(145, 68);

        assertEquals(77, resultado);
    }
}