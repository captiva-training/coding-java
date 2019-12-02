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
        for (int i = 0; i < productoList.size(); i++) {
            importeTotal += productoList.get(i).getPrecio() * productoList.get(i).getCantidadProducto()
                    - productoList.get(i).getDescuento();
        }
        return importeTotal;
    }

    public String imprimir() {
        String imprimir = "";
        for (int i = 0; i < productoList.size(); i++) {
            imprimir += productoList.get(i).getCantidadProducto() + " " + productoList.get(i).getUnidadMedida() + " - "
                    + productoList.get(i).getNombre() + " , Bs " + productoList.get(i).getPrecio() + " - Bs "
                    + productoList.get(i).getPrecio() * productoList.get(i).getCantidadProducto() + "\n";
        }
        imprimir += "Total - Bs " + importeTotal();
        return imprimir;
    }
}
