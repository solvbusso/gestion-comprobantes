package interfaces;

import modelos.Factura;
import modelos.Remito;

import java.util.List;

public interface IModificar {

    List<Factura> modificarVendedor (List<Factura> facturas, String vendedor, String nuevoVendedor);

    List<Factura> modificarCodigo (List<Factura> facturas, int codigo);

    List<Remito> modificar (List<Remito> remitos, int fechaDeEntrega, int nuevaFecha);
}
