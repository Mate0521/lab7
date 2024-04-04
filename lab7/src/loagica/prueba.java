package loagica;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class prueba {
    @Test
    public void testConsignar() {
        Cuenta cuenta = new Cuenta(1, 1000, "Ahorros");
        cuenta.consignar(500);
        assertEquals(1500, cuenta.getSaldo());
    }

    @Test
    public void testRetirar() {
        Cuenta cuenta = new Cuenta(1, 1000, "Ahorros");
        boolean resultado = cuenta.retirar(500);
        assertTrue(resultado);
        assertEquals(500, cuenta.getSaldo());
    }

    @Test
    public void testRetirarSinSaldo() {
        Cuenta cuenta = new Cuenta(1, 1000, "Ahorros");
        boolean resultado = cuenta.retirar(2000);
        assertTrue(!resultado);
        assertEquals(1000, cuenta.getSaldo());
    }


}
