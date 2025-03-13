package com.miempresa.entidad;

import com.miempresa.entidad.Producto;
import com.miempresa.entidad.Tienda;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

class TiendaTest {

    @Test
    void testAgregarProducto() {
        Tienda tienda = new Tienda();
        Producto producto = new Producto("Tablet", 200.0);
        tienda.agregarProducto(producto);
        assertEquals(1, tienda.obtenerProductos().size());
    }

    @Test
    void testObtenerProductos() {
        Tienda tienda = new Tienda();
        Producto p1 = new Producto("Smartphone", 800.0);
        Producto p2 = new Producto("Router", 100.0);

        tienda.agregarProducto(p1);
        tienda.agregarProducto(p2);

        List<Producto> productos = tienda.obtenerProductos();
        assertEquals(2, productos.size());
        assertTrue(productos.contains(p1));
        assertTrue(productos.contains(p2));
    }

    @Test
    void testCalcularPrecioTotal() {
        Tienda tienda = new Tienda();
        tienda.agregarProducto(new Producto("Portátil", 1200.0));
        tienda.agregarProducto(new Producto("Impresora", 300.0));

        double totalEsperado = 1200.0 + 300.0;
        assertEquals(totalEsperado, tienda.calcularPrecioTotal(), 0.01);
    }

    @Test
    void testCalcularPrecioTotalConTiendaVacia() {
        Tienda tienda = new Tienda();
        assertEquals(0.0, tienda.calcularPrecioTotal());
    }
}
