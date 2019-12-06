package org.captiva.coding.favio;

public class Producto {

        private String nombre;
        private int precio;
        private int cantidad;
        private String unidadDeMedida;
        private int descuento;

    public Producto(String nombre, int precio, int cantidad, String medida, int descuento) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
        this.unidadDeMedida = medida;
        this.descuento = descuento;


    }
    public int getPrecio (){ return precio; }

    public String getNombre() {
        return nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public String getUnidadDeMedida() {
        return unidadDeMedida;
    }

    public int getDescuento() {
        return descuento;
    }

    public int calcularSubtotal() {return cantidad * precio - descuento;}

    public String Imprimir(){ return cantidad + " " + unidadDeMedida + " - " + nombre + ", Bs " + precio + " - Bs " + calcularSubtotal() + "\n";

    }

}
