package org.captiva.coding.Alex;

public class Producto {
    private String nombre;
    private int precio;
    private int cantidadProducto;
    private String unidadMedida;
    private int descuento;

    public Producto(final String nombre, int precio, int cantidadProducto, final String unidadMedida, int descuento) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidadProducto = cantidadProducto;
        this.unidadMedida = unidadMedida;
        this.descuento = descuento;
    }

    public int getPrecio() {
        return precio;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCantidadProducto() {
        return cantidadProducto;
    }

    public String getUnidadMedida() {
        return unidadMedida;
    }

    public int getDescuento() {
        return descuento;
    }

    public int calcularSubTotal() {
        return precio * cantidadProducto
                - descuento;
    }

    public String imprimir() {
        return cantidadProducto + " " + unidadMedida + " - "
                + nombre + " , Bs " + precio + " - Bs "
                + calcularSubTotal() + "\n";
    }
}
