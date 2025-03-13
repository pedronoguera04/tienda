package com.miempresa.entidad;

import java.util.ArrayList;
import java.util.List;

/**
 * Representa una tienda que contiene una lista de productos.
 * Permite agregar productos, obtener la lista de productos y calcular el precio total.
 */
public class Tienda {
    private List<Producto> productos;

    /**
     * Crea una nueva instancia de Tienda con una lista vacía de productos.
     */
    public Tienda() {
        this.productos = new ArrayList<>();
    }

    /**
     * Agrega un producto a la tienda.
     * 
     * @param p El producto a agregar.
     */
    public void agregarProducto(Producto p) {
        productos.add(p);
    }

    /**
     * Devuelve una copia de la lista de productos en la tienda.
     * 
     * @return Una lista de productos disponibles en la tienda.
     */
    public List<Producto> obtenerProductos() {
        return new ArrayList<>(productos);
    }

    /**
     * Calcula el precio total de todos los productos en la tienda.
     * 
     * @return La suma de los precios de todos los productos.
     */
    public double calcularPrecioTotal() {
        return productos.stream().mapToDouble(Producto::getPrecio).sum();
    }
}
