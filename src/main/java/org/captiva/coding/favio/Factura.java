package org.captiva.coding.favio;

import java.util.ArrayList;
import java.util.List;

public class Factura {

    private List<Producto> productoList;

    public Factura (){
        productoList = new ArrayList<>();
    }

    public void comprar (Producto producto){
        productoList.add(producto);

    }

    public int importeTotal() {
        int importeTotal = 0;
        for (Producto producto : productoList) {
            importeTotal += producto.calcularSubtotal();
        }
        return importeTotal;
    }

    public String imprimir() {
        StringBuilder imprimir = new StringBuilder();
        for (Producto producto : productoList) {
            imprimir.append(producto.Imprimir());
        }
        imprimir.append(String.format("Total - Bs %d\n", importeTotal()));

        return imprimir.toString();
    }


}
