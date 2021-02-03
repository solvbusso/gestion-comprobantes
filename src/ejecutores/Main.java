package ejecutores;

import interfaces.IBuscar;
import interfaces.IModificar;
import interfaces.IPoblar;
import interfaces.implementaciones.BuscarImpl;
import interfaces.implementaciones.ModificarImpl;
import interfaces.implementaciones.PoblarImpl;
import modelos.Factura;
import modelos.Remito;

import java.util.List;

public class Main {
    public static void main(String[] args) {

    IPoblar crearComprobantes = new PoblarImpl();
    IBuscar buscarComprobantes = new BuscarImpl();
    IModificar modificarComprobantes = new ModificarImpl();

    List<Factura> misFacturas = crearComprobantes.crearFacturas();
    List<Remito> misRemitos = crearComprobantes.crearRemitos();

    System.out.println(misFacturas);
    System.out.println(misRemitos);

    List<Factura> facturasMayoresA = buscarComprobantes.buscarXMonto(misFacturas, 1000);
    System.out.println(facturasMayoresA);

    List<Factura> facturasDelCliente = buscarComprobantes.buscarXCliete(misFacturas, "Alto Parque");
    System.out.println(facturasDelCliente);

    List<Remito> remitosFirmados = buscarComprobantes.buscarXFirma(misRemitos, true);
    System.out.println(remitosFirmados);

    List<Factura> facturasConCodigo = modificarComprobantes.modificarCodigo(misFacturas, 000);
    System.out.println(facturasConCodigo);

    Factura i = misFacturas.get(0);
    i.setVendedor("Sol");
    System.out.println(i.getVendedor());

    }
}
