package interfaces;

import modelos.Factura;
import modelos.Remito;

import java.util.List;

public interface IEliminar {
    Factura eliminarFacturasXCodigo(List<Factura> facturas, int codigo);
    List<Remito> eliminarRemitosXFirma(List<Remito> remitos, boolean firma);
}
