package com.ejemplo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

class MiAplicacionTest {

    @Test
    void pruebaBasica() {
        assertTrue(3 + 2 == 5, "La suma debe ser correcta");
    }
}
