package com.miempresa.entidad;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ProductoTest {
    private Producto producto;

    @BeforeEach
    void setUp() {
        producto = new Producto("Laptop", 1000.0);
    }

    @Test
    void testGetNombre() {
        assertEquals("Laptop", producto.getNombre(), "El nombre del producto no es el esperado.");
    }

    @Test
    void testGetPrecio() {
        assertEquals(1000.0, producto.getPrecio(), "El precio del producto no es el esperado.");
    }

    @Test
    void testSetNombre() {
        producto.setNombre("Smartphone");
        assertEquals("Smartphone", producto.getNombre(), "El nombre del producto no se actualizó correctamente.");
    }

    @Test
    void testSetPrecio() {
        producto.setPrecio(500.0);
        assertEquals(500.0, producto.getPrecio(), "El precio del producto no se actualizó correctamente.");
    }

    @Test
    void testSetPrecioNegativoDebeLanzarExcepcion() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            producto.setPrecio(-50.0);
        });

        assertEquals("El precio no puede ser negativo: -50.0", exception.getMessage());
    }
}
