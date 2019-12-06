package org.captiva.coding.Alex;

import java.util.ArrayList;
import java.util.List;

public class Factura {
    private List<Producto> productoList;

    public Factura() {
        productoList = new ArrayList<>();
    }

    public void comprar(final Producto producto) {
        productoList.add(producto);
    }

    public int importeTotal() {
        int importeTotal = 0;
        for (Producto producto : productoList) {
            importeTotal += producto.calcularSubTotal();
        }
        return importeTotal;
    }

    public String imprimir() {
        StringBuilder imprimir = new StringBuilder();
        for (Producto producto : productoList) {
            imprimir.append(producto.imprimir());
        }
        imprimir.append("Total - Bs ").append(importeTotal());
        return imprimir.toString();
    }
}
