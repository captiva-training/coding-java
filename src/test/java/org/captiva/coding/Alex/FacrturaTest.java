package org.captiva.coding.Alex;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FacrturaTest {
    @Test
    public void testImporteTotalCompraSinProductos() {
        Factura factura = new Factura();
        final int valorEsperado = 0;
        final int valorCalculado = factura.importeTotal();
        assertEquals(valorEsperado, valorCalculado);
    }

    @Test
    public void testImporteTotalCompraConUnProducto() {
        Factura factura = new Factura();
        final int precioPan = 1;
        final int cantidadPan = 1;
        final int descuentoPan = 0;
        factura.comprar(new Producto("Pan", precioPan, cantidadPan, "u", descuentoPan));
        final int valorEsperado = 1;
        final int valorCalculado = factura.importeTotal();
        assertEquals(valorEsperado, valorCalculado);
    }

    @Test
    public void testImporteTotalCompraEjemplo() {
        Factura factura = new Factura();
        final int precioPan = 1;
        final int cantidadProductoPan = 1;
        final int descuentoPan = 0;
        factura.comprar(new Producto("Pan", precioPan, cantidadProductoPan, "u", descuentoPan));
        final int precioFideo = 5;
        final int cantidadProductoFideo = 1;
        final int descuentoFideo = 0;
        factura.comprar(new Producto("Fideos", precioFideo, cantidadProductoFideo, "kg", descuentoFideo));
        final int precioLeche = 6;
        final int cantidadProductoLeche = 1;
        final int descuentoLeche = 0;
        factura.comprar(new Producto("Bolsa de leche", precioLeche, cantidadProductoLeche, "lt", descuentoLeche));
        final int valorEsperado = 12;
        final int valorCalculado = factura.importeTotal();
        assertEquals(valorEsperado, valorCalculado);
    }

    @Test
    public void testImprimir() {
        Factura factura = new Factura();
        final int precioPan = 1;
        final int cantidadProductoPan = 1;
        final int descuentoPan = 0;
        factura.comprar(new Producto("Pan", precioPan, cantidadProductoPan, "u", descuentoPan));
        final int precioFideo = 5;
        final int cantidadProductoFideo = 1;
        final int descuentoFideo = 0;
        factura.comprar(new Producto("Fideos", precioFideo, cantidadProductoFideo, "kg", descuentoFideo));
        final int precioLeche = 6;
        final int cantidadProductoLeche = 1;
        final int descuentoLeche = 0;
        factura.comprar(new Producto("Bolsa de leche", precioLeche, cantidadProductoLeche, "lt", descuentoLeche));
        assertEquals("1 u - Pan , Bs 1 - Bs 1\n"  +
                "1 kg - Fideos , Bs 5 - Bs 5\n" +
                "1 lt - Bolsa de leche , Bs 6 - Bs 6\n" +
                "Total - Bs 12", factura.imprimir());
    }

    @Test
    public void testImporteTotalCompraCantidad() {
        Factura factura = new Factura();
        final int precioPan = 1;
        final int cantidadProductoPan = 3;
        final int descuentoPan = 0;
        factura.comprar(new Producto("Pan", precioPan, cantidadProductoPan, "u", descuentoPan));
        final int precioFideo = 5;
        final int cantidadProductoFideo = 2;
        final int descuentoFideo = 0;
        factura.comprar(new Producto("Fideos", precioFideo, cantidadProductoFideo, "kg", descuentoFideo));
        final int precioLeche = 6;
        final int cantidadProductoLeche = 1;
        final int descuentoLeche = 0;
        factura.comprar(new Producto("Bolsa de leche", precioLeche, cantidadProductoLeche, "lt", descuentoLeche));
        final int valorEsperado = 19;
        final int valorCalculado = factura.importeTotal();
        assertEquals(valorEsperado, valorCalculado);
    }

    @Test
    public void testImporteTotalCompraDescuento() {
        Factura factura = new Factura();
        final int precioPan = 1;
        final int cantidadProductoPan = 3;
        final int descuentoPan = 1;
        factura.comprar(new Producto("Pan", precioPan, cantidadProductoPan, "u", descuentoPan));
        final int precioFideo = 5;
        final int cantidadProductoFideo = 2;
        final int descuentoFideo = 2;
        factura.comprar(new Producto("Fideos", precioFideo, cantidadProductoFideo, "kg", descuentoFideo));
        final int precioLeche = 6;
        final int cantidadProductoLeche = 1;
        final int descuentoLeche = 0;
        factura.comprar(new Producto("Bolsa de leche", precioLeche, cantidadProductoLeche, "lt", descuentoLeche));
        final int valorEsperado = 16;
        final int valorCalculado = factura.importeTotal();
        assertEquals(valorEsperado, valorCalculado);
    }
}
