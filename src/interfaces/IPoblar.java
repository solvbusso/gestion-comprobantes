package interfaces;

import modelos.Comprobante;
import modelos.Factura;
import modelos.Remito;

import java.util.List;

public interface IPoblar {

    List<Remito> crearRemitos();
    List<Factura> crearFacturas();

}
