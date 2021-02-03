package interfaces;

import modelos.Factura;
import modelos.Remito;

import java.util.List;

public interface IBuscar {

    List<Factura> buscarXMonto(List<Factura> facturas, int monto);
    List<Factura> buscarXCliete(List<Factura> facturas, String cliente);

    List<Remito> buscarXFirma(List<Remito> remitos, boolean estaFirmado);

}
