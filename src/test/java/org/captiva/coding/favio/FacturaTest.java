package org.captiva.coding.favio;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FacturaTest {

    @Test
    public void testImporteTotalCompraSinProductos() {
        Factura factura = new Factura();
        int valorEsperado = 0;
        int valorCalculado = factura.importeTotal();
        assertEquals(valorEsperado,valorCalculado);
    }

    @Test
    public void testImporteTotalCompraConUnProducto() {
        Factura factura = new Factura();
        factura.comprar(new Producto("Pan",1,1, "u", 0));
        int valorEsperado = 1;
        int valorCalculado = factura.importeTotal();
        assertEquals(valorEsperado,valorCalculado);

    }

    @Test
    public void testImporteTotalCompraEjemplo() {
        Factura factura = new Factura();
        factura.comprar(new Producto("Pan",1, 1, "u", 0));
        factura.comprar(new Producto("Fideos",5, 1, "kg", 0));
        factura.comprar(new Producto("Bolsa de leche",6, 1, "lt", 0));
        int valorEsperado = 12;
        int valorCalculado = factura.importeTotal();
        assertEquals(valorEsperado,valorCalculado);
    }

    @Test
    public void testImprimir() {
        Factura factura = new Factura();
        factura.comprar(new Producto("Pan",1, 1,"u",0 ));
        factura.comprar(new Producto("Fideos",5, 1, "kg", 0));
        factura.comprar(new Producto("Bolsa de leche",6, 1, "lt", 0));
        assertEquals("1 u - Pan, Bs 1 - Bs 1\n" +
                "1 kg - Fideos, Bs 5 - Bs 5\n" +
                "1 lt - Bolsa de leche, Bs 6 - Bs 6\n" +
                "Total - Bs 12\n", factura.imprimir());
    }

    @Test
    public void testcantidad() {
        Factura factura = new Factura();
        factura.comprar(new Producto("Pan", 1, 3, "u", 0));
        factura.comprar(new Producto("Fideos", 5, 2, "kg", 0));
        factura.comprar(new Producto("Bolsa de leche", 6, 1, "lt", 0));
        int valorEsperado = 19;
        int valorCalculado = factura.importeTotal();
        assertEquals(valorEsperado, valorCalculado);
    }

    @Test
    public void testImprimirCantidad() {
        Factura factura = new Factura();
        factura.comprar(new Producto("Pan",1, 3, "u", 0));
        factura.comprar(new Producto("Fideos",5, 2, "kg", 0));
        factura.comprar(new Producto("Bolsa de leche",6, 1, "lt", 0));
        assertEquals("3 u - Pan, Bs 1 - Bs 3\n" +
                "2 kg - Fideos, Bs 5 - Bs 10\n" +
                "1 lt - Bolsa de leche, Bs 6 - Bs 6\n" +
                "Total - Bs 19\n", factura.imprimir());
    }

    @Test
    public void testDescuento() {
        Factura factura = new Factura();
        factura.comprar(new Producto("Pan",1, 5, "u", 1));
        factura.comprar(new Producto("Fideos",5, 2, "kg", 0));
        factura.comprar(new Producto("Bolsa de leche",6, 1, "lt", 0));
        assertEquals("5 u - Pan, Bs 1 - Bs 4\n" +
                "2 kg - Fideos, Bs 5 - Bs 10\n" +
                "1 lt - Bolsa de leche, Bs 6 - Bs 6\n" +
                "Total - Bs 20\n", factura.imprimir());
    }

}
